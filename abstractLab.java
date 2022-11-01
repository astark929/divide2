package testingCode;

public class abstractLab {

    public static void main (String [] args){

        ameca mec = new ameca(100, 0, true, 100, true);

        System.out.println("the current ameca status: \n"
        + "\t operational: " + mec.operational() +"\n" +
             "\t storage is currently at: " + mec.storageCapacity + "\n" +
                "\t battery level is currently at: " + mec.batterylevel + "\n" +
                "\t the robot has walked : " + mec.steps + " steps \n" +
                "\t the robot is currently on: " + mec.on);
    }
}

/*

<VBox alignment="CENTER" spacing="20.0" xmlns:fx="http://javafx.com/fxml"
      fx:controller="com.example.javafxproject.HelloController">
    <padding>
        <Insets bottom="20.0" left="20.0" right="20.0" top="20.0"/>
    </padding>

    <Label fx:id="welcomeText"/>
    <Button text="Hello!" onAction="#onHelloButtonClick"/>
</VBox>

 */