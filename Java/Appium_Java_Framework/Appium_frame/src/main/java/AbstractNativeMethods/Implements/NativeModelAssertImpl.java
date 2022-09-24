package AbstractNativeMethods.Implements;

import AbstractNativeMethods.Interfaces.NativeModelAssertInterface;
import org.testng.Assert;

public class NativeModelAssertImpl implements NativeModelAssertInterface {


    /*
    ##########################################
    #            Patron de Diseño            #
    #           ScreeenPlayActions           #
    #                                        #
    #  Clase - ModelAssertImpl              #
    #  Se crean una Implementación Objetos   #
    #  mediante una interface que hace que   #
    #  Estos metodos se inicialicen.         #
    #                                        #
    #  Con el Objetico de crear              #
    #  Metodos JAVA a partir de los Assert´s #
    #  de TestNG - Selenium.                 #
    #                                        #
    ##########################################
    */


    public void assertTrue(boolean condition, String message) {
        Assert.assertTrue(condition, message);
        return;
    }

    public void assertFalse(boolean condition) {
        Assert.assertFalse(condition);
        return;
    }

    public void assertFalse(boolean condition, String message) {
        Assert.assertFalse(condition, message);
        return;
    }

    public void assertEquals(boolean actual, boolean expected) {
        Assert.assertEquals(actual, expected);
        return;
    }

    public void assertEquals(Object actual, Object expected) {
        Assert.assertEquals(actual, expected);
        return;
    }

    public void assertEquals(String condition, String message) {
        Assert.assertEquals(condition, message);
        return;
    }

    public void assertEquals(Object[] actual, Object[] expected) {
        Assert.assertEquals(actual, expected);
        return;
    }

    public void  assertEquals(Object actual, Object expected, String message) {
        Assert.assertEquals(actual, expected, message);
        return;
    }

    public void verifyTrue(boolean condition, String message) {
        try {
            assertTrue(condition, message);
        } catch(Throwable e) {
            e.getMessage();
        }
        return;
    }

    public void verifyFalse(boolean condition) {
        try {
            assertFalse(condition);
        } catch(Throwable e) {
            e.getMessage();
        }
        return;
    }

    public void verifyFalse(boolean condition, String message) {
        try {
            assertFalse(condition, message);
        } catch(Throwable e) {
            e.getMessage();
        }
        return;
    }

    public void verifyEquals(boolean actual, boolean expected) {
        try {
            assertEquals(actual, expected);
        } catch(Throwable e) {
            e.getMessage();
        }
        return;
    }

    public void verifyEquals(String actual, String expected) {
        try {
            assertEquals(actual, expected);
        } catch(Throwable e) {

            e.getMessage();

        }
        return;
    }

    public void verifyEquals(int actual, int expected) {
        try {
            assertEquals(actual, expected);
        } catch(Throwable e) {

            e.getMessage();

        }
        return;
    }

    public void verifyEquals(Object actual, Object expected) {
        try {
            assertEquals(actual, expected);
        } catch(Throwable e) {
            e.getMessage();
        }
        return;
    }

    public void verifyEquals(Object[] actual, Object[] expected) {
        try {
            assertEquals(actual, expected);
        } catch(Throwable e) {
            e.getMessage();
        }
        return;
    }
}
