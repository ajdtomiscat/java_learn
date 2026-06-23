static void test() {
    int num1, num2;
    try {
        num1 = 0;
        num2 = 62 / num1;
        System.out.println(num2);
        System.out.println("try 块的最后一句");
    } catch (ArithmeticException e) {
        // 算术运算发生时跳转到这里
        System.out.println("除数不能为零");
    } catch (Exception e) {
        // 通用型的异常意味着可以捕获所有的异常，它应该放在最后面，
        System.out.println("异常发生了");
    }
    System.out.println("try-catch 之外的代码.");
}