package sample;

import java.util.logging.Logger;

public class LogicActions {

    final static Logger LOGGER = Logger.getLogger(Main.class.getName());

    private Boolean argument1 = null;
    private Boolean argument2 = null;

    public void setArgument1(Boolean argument1) {
        LOGGER.info("First argument = " + argument1 + ".");
        this.argument1 = argument1;
    }

    public void setArgument2(Boolean argument2) {
        LOGGER.info("Second argument = " + argument2 + ".");
        this.argument2 = argument2;
    }

    public Boolean getArgument1() {
        return argument1;
    }

    public Boolean getArgument2() {
        return argument2;
    }

    Boolean conjunction(){
        if (argument1!=null&&argument2!=null){
            LOGGER.info("Result of conjuction = " + (argument1&&argument2) + ".");
            return argument1&&argument2;
        }
        else if ((argument1!=null&& !argument1) || (argument2!=null&& !argument2)){
            LOGGER.info("Result of conjuction = false.");
            return false;
        }
        LOGGER.info("Result of conjuction = null.");
        return null;
    }

    Boolean disjunction(){
        if (argument1!=null&&argument2!=null){
            LOGGER.info("Result of disjunction = " + (argument1||argument2) + ".");
            return argument1||argument2;
        }
        else if ((argument1!=null&& argument1) || (argument2!=null&& argument2)){
            LOGGER.info("Result of disjunction = true.");
            return true;
        }
        LOGGER.info("Result of disjunction = null.");
        return null;
    }

    Boolean constTrue(){
        LOGGER.info("Result of constTrue = true.");
        return true;
    }

    Boolean constFalse() {
        LOGGER.info("Result of constFalse = false.");
        return false;
    }

    Boolean equivalence() {
        if((argument1 == argument2)&&(argument1 != null && argument2 != null)){
            LOGGER.info("Result of equivalence = true.");
            return true;
        }
        LOGGER.info("Result of equivalence = false.");
        return false;
    }

    Boolean exclusiveDisjunction() {
        if(argument1!=null && argument2!=null){
            LOGGER.info("Result of Exclusive Disjunction = ." +
                    ((argument1||argument2)&&(!argument1||!argument2)) + ".");
            return ((argument1||argument2)&&(!argument1||!argument2));
        }
        LOGGER.info("Result of Exclusive Disjunction = null.");
        return null;
    }

    Boolean implication() {
        if (argument1!=null && argument2!=null){
            LOGGER.info("Result of implication = " + (!argument1||argument2) + ".");
            return !argument1||argument2;
        }
        else if((argument1!=null && !argument1)){
            LOGGER.info("Result of implication = true.");
            return true;
        }
        else if((argument2!=null && argument2)){
            LOGGER.info("Result of implication = true.");
            return true;
        }
        LOGGER.info("Result of implication = null.");
        return null;
    }

    Boolean notImplication() {
        if(argument1!=null && argument2!=null){
            LOGGER.info("Result of notImplication = " + (!(!argument1||argument2)) + ".");
            return !(!argument1||argument2);
        }
        else if((argument1!=null && argument1==false)){
            LOGGER.info("Result of notImplication = false.");
            return false;
        }
        else if((argument2!=null && argument2==true)){
            LOGGER.info("Result of notImplication = false.");
            return false;
        }
        LOGGER.info("Result of notImplication = null.");
        return null;
    }

    Boolean reverseImplication() {
        if(argument1!=null && argument2!=null){
            LOGGER.info("Result of notImplication = " + (argument1||!argument2) + ".");
            return argument1||!argument2;
        }
        else if((argument2!=null && argument2==false)){
            LOGGER.info("Result of reverse implication = true.");
            return true;
        }
        else if((argument1!=null && argument1==true)){
            LOGGER.info("Result of reverse implication = true.");
            return true;
        }
        LOGGER.info("Result of reverse implication = null.");
        return null;
    }

    Boolean notReverseImplication() {
        if(argument1!=null && argument2!=null){
            LOGGER.info("Result of not reverse implication = " +
                    (!(argument1||!argument2)) + ".");
            return !(argument1||!argument2);
        }
        else if((argument2!=null && argument2==false)){
            LOGGER.info("Result of not reverse implication = false.");
            return false;
        }
        else if((argument1!=null && argument1==true)){
            LOGGER.info("Result of not reverse implication = false.");
            return false;
        }
        LOGGER.info("Result of not reverse implication = null.");
        return null;
    }

    Boolean pierceArrow() {
        if(argument1!=null && argument2!=null){
            LOGGER.info("Result of pierce arrow = " + (!argument1&&!argument2) + ".");
            return !argument1&&!argument2;
        }
        else if (argument2!=null&&argument2){
            LOGGER.info("Result of pierce arrow = false.");
            return false;
        }
        LOGGER.info("Result of pierce arrow = true.");
        return null;
    }

    Boolean shefferBrush() {
        if(argument1!=null && argument2!=null){
            LOGGER.info("Result of sheffer brush = " + (!argument1||!argument2) + ".");
            return (!argument1||!argument2);
        }
        else if (argument2!=null&&!argument2){
            LOGGER.info("Result of sheffer brush = true.");
            return true;
        }
        LOGGER.info("Result of sheffer brush = null.");
        return null;
    }

    Boolean repeatFirstArg() {
        LOGGER.info("Result of repeat first argument = " + argument1 + ".");
        return argument1;
    }

    Boolean repeatSecondArg() {
        LOGGER.info("Result of repeat first argument = " + argument2 + ".");
        return argument2;
    }

    Boolean notFirstArg() {
        if (argument1 != null){
            LOGGER.info("Result of not first argument = " + !argument1 + ".");
            return (!argument1);
        }
        LOGGER.info("Result of not first argument = null.");
        return null;
    }

    Boolean notSecondArg() {
        if (argument2 != null){
            LOGGER.info("Result of not second argument = " + !argument2 + ".");
            return (!argument2);
        }
        LOGGER.info("Result of not second argument = null.");
        return null;
    }
}