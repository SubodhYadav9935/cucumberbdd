interface Test{      // this is not a functional interface
    void m1();
    void m2();
    void m3();
}
Test T = new Test(){          // this is called the  anonymous inner class
    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }
};

public void main() {
}
