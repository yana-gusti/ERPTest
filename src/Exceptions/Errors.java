package Exceptions;

import data.Settings;

/**
 * Created with IntelliJ IDEA.
 * User: Дом
 * Date: 25.12.13
 * Time: 13:07
 * To change this template use File | Settings | File Templates.
 */
public class Errors extends InterruptedException {
    public Errors() {
        Settings.getDriver().close();
    }
}
