package com.doub1e;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private Account loginAcc; //记住登录后的用户账户

    /** 启动ATM系统 展示欢迎页 **/
    public void start(){
        while (true) {
            System.out.println("========欢迎您进入到ATM系统==========");
            System.out.println("1、用户登录");
            System.out.println("2、用户开户");
            System.out.println("请选择：");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    //用户登录
                    login();
                    break;
                case 2:
                    //用户开户
                    createAccount();
                    break;
                default:
                    System.out.println("没有该操作");
            }
        }
    }

    /** 完成用户的登录操作 */
    private void login(){
        System.out.println("==系统登录==");
        // 1.判断系统中是否存在账户对象 存在才可以登录；如果不存在 结束登录操作
        if(accounts.size() == 0){
            System.out.println("当前系统中无账户，请先开户");
            return;//跳出登录
        }
        //2.系统中存在账户对象 进行登录操作
        while (true) {
            System.out.println("请您输入你的登录卡号：");
            String cardId = sc.next();
            //3.判断这个卡号是否存在
            Account acc = getAccountByCardId(cardId);
            if(acc == null){
                //卡号不存在
                System.out.println("您输入的登录卡号不存在，请确认");
            }else {
                while (true) {
                    //卡号存在
                    System.out.println("请您输入登录密码：");
                    String passWord = sc.next();
                    // 4.判断密码是否正确
                    if(acc.getPassword().equals(passWord)){
                        loginAcc = acc;
                        //密码正确 登录成功了
                        System.out.println("恭喜你：" + acc.getUserName() + "成功登录了，您的卡号是：" + acc.getCardId());
                        //展示登录后的操作界面
                        showUserCommand();
                        return;//跳出并结束当前登录方法

                    }else {
                        System.out.println("您输入的密码错误，请重新输入");
                    }
                }
            }
        }
    }
    /** 展示登录后的操作页面 */
    private void showUserCommand(){
        while (true) {
            System.out.println(loginAcc.getUserName() + "您可以选择如下功能进行账户处理===");
            System.out.println("请选择：");
            System.out.println("1.查询账户");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.密码修改");
            System.out.println("6.退出");
            System.out.println("7.注销当前账户");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    //查询当前账户
                    showLoginAccount();
                    break;
                case 2:
                    //存款操作
                    depositMoney();
                    break;
                case 3:
                    //取款操作
                    drawMoney();
                    break;
                case 4:
                    //转账操作
                    transferMoney();
                    break;
                case 5:
                    //密码修改
                    updatePassWord();
                    return;
                case 6:
                    //退出
                    System.out.println(loginAcc.getUserName() + "您成功退出系统！");
                    return;//退出并结束当前方法
                case 7:
                    //注销账户
                    if(deleteAccount()){
                        // 销户成功了 回到欢迎页面
                        return;
                    }
                    break;
                default:
                    System.out.println("您当前选择的操作不存在 请确认");
            }
        }
    }
    /** 账户密码修改 */
    private void updatePassWord() {
        System.out.println("===账户密码修改操作===");
        while (true) {
            // 1.提醒用户认证当前密码
            System.out.println("请您输入当前账户密码：");
            String passWord = sc.next();

            // 2.认证当前密码是否正确
            if(loginAcc.getPassword().equals(passWord)){
                // 认证通过
                while (true) {
                    // 3.开始修改密码
                    System.out.println("请您输入新密码：");
                    String newPassWord = sc.next();

                    System.out.println("请您再次确认新密码：");
                    String okPassWord = sc.next();

                    // 4.判断两次密码是否一致
                    if(okPassWord.equals(newPassWord)){
                        // 密码一致 真正开始修改密码
                        loginAcc.setPassword(newPassWord);
                        System.out.println("恭喜您，你的密码修改成功~");
                        return;
                    }else {
                        //两次密码不一致
                        System.out.println("您输入的两次密码不一致");
                    }
                }

            }else {
                System.out.println("您输入的密码错误");
            }
        }
    }

    /** 注销账户 */
    private boolean deleteAccount() {
        System.out.println("===进行销户操作===");
        // 1.询问用户是否确定销户
        System.out.println("请问您是否确定销户吗？ y/n");
        String command = sc.next();
        switch (command){
            case "y":
                //用户确定销户
                // 2.判断用户账户中是否还有余额
                if(loginAcc.getMoney() == 0){
                    accounts.remove(loginAcc);
                    System.out.println("您好，您的账户已注销");
                    return true;
                }else{
                    System.out.println("对不起，您的账户存在金额。无法销户");
                    return false;
                }

            default:
                System.out.println("好的，将为您保留账户~");
                return false;

        }
    }

    /** 转账 */
    private void transferMoney() {
        System.out.println("===用户转账===");
        // 1.判断当前系统是否存在其他账户
        if(accounts.size() < 2){
            System.out.println("当前系统只有一个账户，无法为其他用户转账");
            return;
        }

        // 2.判断自己账户是否有钱
        if(loginAcc.getMoney() == 0){
            System.out.println("您自己都没钱，别转辣");
            return;
        }
        while (true) {
            // 3.真正开始转账
            System.out.println("请你输入对方的卡号:");
            String cardId = sc.next();

            // 4.判断这个卡号是否正确
            Account acc = getAccountByCardId(cardId);
            if(acc == null){
                System.out.println("您输入对方的卡号有误");
                return;
            }else {
                // 对方账户存在 继续让用户认证姓氏
                String name = "*" + acc.getUserName().substring(1); //*南彭于晏
                System.out.println("请你输入【" + name + "】的姓氏：");
                String preName = sc.next();
                // 5.判断姓氏是否正确
                if(acc.getUserName().startsWith(preName)){
                    while (true) {
                        //认证通过 开始转账操作
                        System.out.println("请您输入给对方转账的金额：");
                        double money = sc.nextDouble();

                        //判断转账金额是否超过自己的余额
                        if(loginAcc.getMoney() >= money){
                            //转给对方了
                            //更新自己的账户余额
                            loginAcc.setMoney(loginAcc.getMoney() - money);
                            //更新对方的账户余额
                            acc.setMoney(acc.getMoney() + money);
                            System.out.println("您转账成功了~");
                            return;//跳出转账方法
                        }else {
                            System.out.println("余额不足，最多可转" + loginAcc.getMoney());
                        }
                    }
                }else{
                    System.out.println("您认证的姓氏失败");
                }
            }
        }
    }

    /** 取钱 */
    private void drawMoney() {
        System.out.println("===取钱操作===");
        // 1.判断账户余额是否达到100 小于100不让取钱
        if(loginAcc.getMoney() < 100){
            System.out.println("账户金额不足100，无法取钱");
            return;
        }
        // 2.让用户输入取钱金额
        while (true) {
            System.out.println("请您输入取钱金额：");
            double money = sc.nextDouble();

            // 3.判断账户余额是否足够
            if(loginAcc.getMoney() >= money){
                // 账户余额足够
                // 4.判断当前取款金额是否超过每次限额
                if(money > loginAcc.getLimit()){
                    System.out.println("您当前取款金额超过了每次限额，您每次最多可取：" + loginAcc.getLimit());
                }else {
                    // 代表可以取钱 更新当前账户余额即可
                    loginAcc.setMoney(loginAcc.getMoney() - money);
                    System.out.println("您取款" + money + "成功,账户余额为：" + loginAcc.getMoney());
                    break;
                }
            }else {
                System.out.println("余额不足，您的账户余额是："  + loginAcc.getMoney());
            }
        }
    }

    /** 存钱 */
    private void depositMoney() {
        System.out.println("===存钱操作===");
        System.out.println("请您输入存款金额：");
        double money = sc.nextDouble();

        // 更新当前登录账户的余额
        loginAcc.setMoney(loginAcc.getMoney() + money);
        System.out.println("恭喜您，已存钱" + money + "账户余额：" + loginAcc.getMoney());
    }

    /**
     * 展示当前登录的账户信息
     */
    private void showLoginAccount(){
        System.out.println("===当前您的账户信息如下：===");
        System.out.println("卡号是：" + loginAcc.getCardId());
        System.out.println("户主是：" + loginAcc.getUserName());
        System.out.println("性别是：" + loginAcc.getSex());
        System.out.println("余额是：" + loginAcc.getMoney());
        System.out.println("每次提现额度是：" + loginAcc.getLimit());
    }
    /** 完成用户开户操作 **/
    private void createAccount(){
        System.out.println("==系统开户操作==");
        // 1.创建一个账户对象 用于封装用户的开户信息
        Account acc = new Account();

        // 2.需要用户输入自己的开户信息 赋值给账户对象
        System.out.println("请您输入您的账户名称：");
        String name = sc.next();
        acc.setUserName(name);

        while (true) {
            System.out.println("请您输入您的性别：");
            char sex = sc.next().charAt(0);//男
            if(sex == '男' || sex == '女'){
                acc.setSex(sex);
                break;
            }else {
                System.out.println("您输入的性别有误");
            }
        }

        while (true) {
            System.out.println("请您输入你的账户密码：");
            String password = sc.next();
            System.out.println("请您确认你的账户密码：");
            String okPassword = sc.next();
            //判断两次密码是否相同
            if(okPassword.equals(password)){
                acc.setPassword(okPassword);
                break;
            }else {
                System.out.println("您输入的两次密码不一致 请检查后重新输入~");
            }
        }

        System.out.println("请你输入你的提现额度：");
        double limit = sc.nextDouble();
        acc.setLimit(limit);

        //key point 需要每次为这个账户生成一个卡号(系统自动生成8位卡号 且不能重复
        String newCardId = creatCardId();
        acc.setCardId(newCardId);

        // 3.把账户对象存入到账户集合中去
        accounts.add(acc);
        System.out.println("恭喜" + acc.getUserName() + "开户成功！您的卡号是：" + acc.getCardId());
    }
    /** 返回一个8位数字的卡号 且卡号不能重复 */
    private String creatCardId(){
        while (true) {
            // 1.定义一个String类型变量记住8位卡号
            String cardId = "";
            // 2.使用循环 每次产生一个随机数给cardId连接起来
            Random r = new Random();
            for (int i = 0; i < 8; i++) {
                int data = r.nextInt(10); //0~9
                cardId += data ;
            }
            // 3.判断CardId中记住的卡号是否与其他账户的卡号重复
            Account acc = getAccountByCardId(cardId);
            //
            if (acc == null) {
                //cardId没有和其他账户卡号重复
                return cardId;
            }
        }
    }
    /** 根据卡号查找账户对象返回 accounts = [c1,c2,c3...]*/
    private Account getAccountByCardId(String cardId){
        // 遍历全部的账户对象
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            //判断这个账户对象acc的卡号是否是要找的卡号
            if(acc.getCardId().equals(cardId)){
                return acc;
            }
        }
        return null; //卡号不存在
    }

}
