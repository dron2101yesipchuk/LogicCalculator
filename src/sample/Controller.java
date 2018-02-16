package sample;

import com.google.gson.Gson;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label actionsLabel;

    @FXML
    private Label resultLabel;

    @FXML
    private JFXButton trueBtn;

    @FXML
    private JFXButton falseBtn;

    @FXML
    private JFXButton nullBtn;

    @FXML
    private JFXButton equalsBtn;

    @FXML
    private JFXButton disjunctionBtn;

    @FXML
    private JFXButton conjunctionBtn;

    @FXML
    private JFXButton equivalenceBtn;

    @FXML
    private JFXButton exclusiveDisjunctionBtn;

    @FXML
    private JFXButton implicationBtn;

    @FXML
    private JFXButton reverseImplicationBtn;

    @FXML
    private JFXButton notImplicationBtn;

    @FXML
    private JFXButton notReverseImplicationBtn;

    @FXML
    private JFXButton constTrueBtn;

    @FXML
    private JFXButton constFalseBtn;

    @FXML
    private JFXButton shefferBrushBtn;

    @FXML
    private JFXButton pierceArrowBtn;

    @FXML
    private JFXButton repeatFirstArgBtn;

    @FXML
    private JFXButton repeatSecondArgBtn;

    @FXML
    private JFXButton notFirstArgBtn;

    @FXML
    private JFXButton notSecondArgBtn;

    @FXML
    private JFXButton clearBtn;

    @FXML
    private JFXTextArea historyOfActionsTextArea;

    private LogicActions logicAction = new LogicActions();
    private boolean ifArg1Set;
    private int numberOfOperation;

    public void initialize(){
        actionsLabel.setAlignment(Pos.CENTER_RIGHT);
        resultLabel.setAlignment(Pos.CENTER_RIGHT);
    }

    @FXML
    void equals(ActionEvent event) {
        Boolean result = null;
        switch (numberOfOperation){
            case 1: logicAction.disjunction(); result = logicAction.getResult(); break;
            case 2: logicAction.conjunction(); result = logicAction.getResult(); break;
            case 3: logicAction.equivalence(); result = logicAction.getResult(); break;
            case 4: logicAction.exclusiveDisjunction(); result = logicAction.getResult(); break;
            case 5: logicAction.implication(); result = logicAction.getResult(); break;
            case 6: logicAction.reverseImplication(); result = logicAction.getResult(); break;
            case 7: logicAction.notImplication(); result = logicAction.getResult(); break;
            case 8: logicAction.notReverseImplication(); result = logicAction.getResult(); break;
            case 9: logicAction.constTrue(); result = logicAction.getResult(); break;
            case 10: logicAction.constFalse(); result = logicAction.getResult(); break;
            case 11: logicAction.shefferBrush(); result = logicAction.getResult(); break;
            case 12: logicAction.pierceArrow(); result = logicAction.getResult(); break;
            case 13: logicAction.repeatFirstArg(); result = logicAction.getResult(); break;
            case 14: logicAction.repeatSecondArg(); result = logicAction.getResult(); break;
            case 15: logicAction.notFirstArg(); result = logicAction.getResult(); break;
            case 16: logicAction.notSecondArg(); result = logicAction.getResult(); break;
        }
        result = logicAction.getResult();
        /*Gson gson = new Gson();
        String info = gson.toJson(logicAction);*/
        //historyOfActionsTextArea.setText(historyOfActionsTextArea.getText() + info + "\n");
        historyOfActionsTextArea.setText(historyOfActionsTextArea.getText() +
                actionsLabel.getText() + "=" + result + "\n");
        resultLabel.setText(result + "");
        actionsLabel.setText("");
        ifArg1Set = false;
    }

    @FXML
    void clear(ActionEvent event) {
        ifArg1Set = false;
        numberOfOperation = 0;
        actionsLabel.setText("");
        resultLabel.setText("");
    }

    @FXML
    void disjunction(ActionEvent event) {
        numberOfOperation = 1;
        actionsLabel.setText(actionsLabel.getText() + " V ");
    }

    @FXML
    void conjunction(ActionEvent event) {
        numberOfOperation = 2;
        actionsLabel.setText(actionsLabel.getText() + " ^ ");
    }

    @FXML
    void equivalence(ActionEvent event) {
        numberOfOperation = 3;
        actionsLabel.setText(actionsLabel.getText() + " ~ ");

    }

    @FXML
    void exclusiveDisjunction(ActionEvent event) {
        numberOfOperation = 4;
        actionsLabel.setText(actionsLabel.getText() + " ⊕ ");

    }

    @FXML
    void implication(ActionEvent event) {
        numberOfOperation = 5;
        actionsLabel.setText(actionsLabel.getText() + " → ");
    }

    @FXML
    void reverseImplication(ActionEvent event) {
        numberOfOperation = 6;
        actionsLabel.setText(actionsLabel.getText() + " ← ");
    }

    @FXML
    void notImplication(ActionEvent event) {
        numberOfOperation = 7;
        actionsLabel.setText(actionsLabel.getText() + " !→ ");
    }

    @FXML
    void notReverseImplication(ActionEvent event) {
        numberOfOperation = 8;
        actionsLabel.setText(actionsLabel.getText() + " !← ");
    }

    @FXML
    void constTrue(ActionEvent event) {
        numberOfOperation = 9;
        actionsLabel.setText(actionsLabel.getText() + " (const 1) ");
    }

    @FXML
    void constFalse(ActionEvent event) {
        numberOfOperation = 10;
        actionsLabel.setText(actionsLabel.getText() + " (const 0) ");
    }

    @FXML
    void shefferBrush(ActionEvent event) {
        numberOfOperation = 11;
        actionsLabel.setText(actionsLabel.getText() + " | ");
    }

    @FXML
    void pierceArrow(ActionEvent event) {
        numberOfOperation = 12;
        actionsLabel.setText(actionsLabel.getText() + " ↓ ");
    }

    @FXML
    void repeatFirstArg(ActionEvent event) {
        numberOfOperation = 13;
        actionsLabel.setText(actionsLabel.getText() + " (repeat first argument) ");
    }

    @FXML
    void repeatSecondArg(ActionEvent event) {
        numberOfOperation = 14;
        actionsLabel.setText(actionsLabel.getText() + " (repeat second argument) ");
    }

    @FXML
    void notFirstArg(ActionEvent event) {
        numberOfOperation = 15;
        actionsLabel.setText(actionsLabel.getText() + " (not first argument) ");
    }

    @FXML
    void notSecondArg(ActionEvent event) {
        numberOfOperation = 16;
        actionsLabel.setText(actionsLabel.getText() + " (not second argument) ");
    }

    @FXML
    void setFalse(ActionEvent event) {
        if(ifArg1Set) {logicAction.setArgument2(false);}
        else {logicAction.setArgument1(false); ifArg1Set = true;}
        actionsLabel.setText(actionsLabel.getText() + "false");
    }

    @FXML
    void setNull(ActionEvent event) {
        if(ifArg1Set) {logicAction.setArgument2(null);}
        else {logicAction.setArgument1(null); ifArg1Set = true;}
        actionsLabel.setText(actionsLabel.getText() + "null");
    }

    @FXML
    void setTrue(ActionEvent event) {
        if(ifArg1Set) {logicAction.setArgument2(true);}
        else {logicAction.setArgument1(true); ifArg1Set = true;}
        actionsLabel.setText(actionsLabel.getText() + "true");
    }
}
