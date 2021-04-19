class UnreachableCodeEx {
    public static void main(String args[])
    {
        int a = 1;
        for (;;) {
            if (a == 1)
            {
                break;
                System.out.println("I want to get printed");
            }
        }
    }
}
