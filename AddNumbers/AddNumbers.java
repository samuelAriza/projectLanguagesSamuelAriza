class AddNumbers{
    static{
        System.loadLibrary("AddNumbers");
    }
    private native int addNumbers(int first, int second);

    public static void main(String[] args) {
        new AddNumbers().addNumbers(5, 1);
    }
}