package model.base;

/**
 * @description:
 * @author: east
 * @date: 2023/10/22
 */

public class DemoClassA {
    private String string;

    public DemoClassA(String string) {
        this.string = string;
    }

    public DemoClassA() {
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}