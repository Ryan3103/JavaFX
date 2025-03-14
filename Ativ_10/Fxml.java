<?xml version="1.0" encoding="UTF-8"?>
<?import javafx.scene.layout.AnchorPane?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.control.TextField?>
<?import javafx.scene.text.Text?>

<AnchorPane xmlns:fx="http://javafx.com/fxml" fx:controller="MainController">
    <Text text="Valor em Reais (R$):" layoutX="20" layoutY="20"/>
    <TextField fx:id="reaisInput" layoutX="150" layoutY="10"/>
    <Button text="Converter" layoutX="150" layoutY="50" onAction="#onConverterClicked"/>
</AnchorPane>
