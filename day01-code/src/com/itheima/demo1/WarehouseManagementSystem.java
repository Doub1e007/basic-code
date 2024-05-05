package com.itheima.demo1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WarehouseManagementSystem {
    private static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=Warehouse_management";
    private static final String DB_USER = "sa";
    private static final String DB_PASSWORD = "123456";

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                createUI();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    private static void createUI() throws Exception {
        JFrame frame = new JFrame("仓库管理系统");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel mainPanel = new JPanel(new GridLayout(8, 1));

        // 产品信息表
        JPanel productInfoPanel = new JPanel(new GridLayout(1, 2));
        JLabel productInfoLabel = new JLabel("产品信息表");
        productInfoPanel.add(productInfoLabel);
        JButton btnCreateProductTable = new JButton("创建产品信息表");
        btnCreateProductTable.addActionListener(e -> {
            try {
                createProductTable();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        });
        productInfoPanel.add(btnCreateProductTable);
        mainPanel.add(productInfoPanel);

        // 进出库表
        JPanel inventoryPanel = new JPanel(new GridLayout(1, 2));
        JLabel inventoryLabel = new JLabel("进出库表");
        inventoryPanel.add(inventoryLabel);
        JButton btnCreateInventoryTable = new JButton("创建进出库表");
        btnCreateInventoryTable.addActionListener(e -> {
            try {
                createInventoryTable();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        });
        inventoryPanel.add(btnCreateInventoryTable);
        mainPanel.add(inventoryPanel);

        // 产品ID
        JPanel productIdPanel = new JPanel(new GridLayout(1, 2));
        JLabel productIdLabel = new JLabel("产品ID");
        productIdPanel.add(productIdLabel);
        JTextField entryProductId = new JTextField();
        productIdPanel.add(entryProductId);
        mainPanel.add(productIdPanel);

        // 数量
        JPanel quantityPanel = new JPanel(new GridLayout(1, 2));
        JLabel quantityLabel = new JLabel("数量");
        quantityPanel.add(quantityLabel);
        JTextField entryQuantity = new JTextField();
        quantityPanel.add(entryQuantity);
        mainPanel.add(quantityPanel);

        // 日期
        JPanel datePanel = new JPanel(new GridLayout(1, 2));
        JLabel dateLabel = new JLabel("日期 (YYYY-MM-DD)");
        datePanel.add(dateLabel);
        JTextField entryDate = new JTextField();
        datePanel.add(entryDate);
        mainPanel.add(datePanel);

        // 产品入库
        JPanel addInventoryPanel = new JPanel(new GridLayout(1, 2));
        JButton btnAddInventory = new JButton("产品入库");
        addInventoryPanel.add(btnAddInventory);
        mainPanel.add(addInventoryPanel);

        // 产品出库
        JPanel removeInventoryPanel = new JPanel(new GridLayout(1, 2));
        JButton btnRemoveInventory = new JButton("产品出库");
        removeInventoryPanel.add(btnRemoveInventory);
        mainPanel.add(removeInventoryPanel);

        // 借出产品
        JPanel lendProductPanel = new JPanel(new GridLayout(1, 2));
        JButton btnLendProduct = new JButton("借出产品");
        lendProductPanel.add(btnLendProduct);
        mainPanel.add(lendProductPanel);

        // 归还产品
        JPanel returnProductPanel = new JPanel(new GridLayout(1, 2));
        JButton btnReturnProduct = new JButton("归还产品");
        returnProductPanel.add(btnReturnProduct);
        mainPanel.add(returnProductPanel);

        // 设置初始库存
        JPanel setInitialInventoryPanel = new JPanel(new GridLayout(1, 2));
        JButton btnSetInitialInventory = new JButton("设置初始库存");
        setInitialInventoryPanel.add(btnSetInitialInventory);
        mainPanel.add(setInitialInventoryPanel);

        // 盘库
        JPanel performStocktakingPanel = new JPanel(new GridLayout(1, 2));
        JButton btnPerformStocktaking = new JButton("盘库");
        performStocktakingPanel.add(btnPerformStocktaking);
        mainPanel.add(performStocktakingPanel);

        // 查询产品入库情况
        JPanel viewProductInPanel = new JPanel(new GridLayout(1, 2));
        JButton btnViewProductIn = new JButton("查询产品入库情况");
        viewProductInPanel.add(btnViewProductIn);
        mainPanel.add(viewProductInPanel);

        // 查询产品出库情况
        JPanel viewProductOutPanel = new JPanel(new GridLayout(1, 2));
        JButton btnViewProductOut = new JButton("查询产品出库情况");
        viewProductOutPanel.add(btnViewProductOut);
        mainPanel.add(viewProductOutPanel);

        // 查询当前库存情况
        JPanel viewInventoryPanel = new JPanel(new GridLayout(1, 2));
        JButton btnViewInventory = new JButton("查询当前库存情况");
        viewInventoryPanel.add(btnViewInventory);
        mainPanel.add(viewInventoryPanel);

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    private static void createProductTable() throws SQLException {
        String sql = "CREATE TABLE Product (ProductID INT PRIMARY KEY, Name NVARCHAR(50), Price DECIMAL(10, 2))";
        executeUpdate(sql);
    }

    private static void createInventoryTable() throws SQLException {
        String sql = "CREATE TABLE Inventory (ID INT IDENTITY(1,1) PRIMARY KEY, ProductID INT, Quantity INT, Type NVARCHAR(10), Date DATE, FOREIGN KEY (ProductID) REFERENCES Product(ProductID))";
        executeUpdate(sql);
    }

    private static void executeUpdate(String sql) throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }
}

