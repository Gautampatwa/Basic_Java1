package Arrays;

import java.io.IOException;

class Animal {
    public void print() throws IOException {
        System.out.println("I love cats");
    }
}

public class Main extends Animal {

    public void print() {
        System.out.println(" I love dogs");
    }

    public static void main(String[] args) {
        new Main().print();
    }
}
