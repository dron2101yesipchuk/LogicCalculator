package sample;

import java.util.logging.Logger;

public class LogicActions {

    final static Logger LOGGER = Logger.getLogger(Main.class.getName());

    private Boolean argument1 = null;
    private Boolean argument2 = null;

    public void setArgument1(Boolean argument1) {
        this.argument1 = argument1;
    }

    public void setArgument2(Boolean argument2) {
        this.argument2 = argument2;
    }

    public Boolean getArgument1() {
        return argument1;
    }

    public Boolean getArgument2() {
        return argument2;
    }

    Boolean conjunction(){
        if (argument1!=null&&argument2!=null)
            return argument1&&argument2;
        else if ((argument1!=null&& !argument1) || (argument2!=null&& !argument2))
            return false;
        return null;
    }

    Boolean disjunction(){
        if (argument1!=null&&argument2!=null)
            return argument1||argument2;
        else if ((argument1!=null&& argument1) || (argument2!=null&& argument2))
            return true;
        return null;
    }

    Boolean constTrue(){
        return true;
    }

    Boolean constFalse() {
        return true;
    }

    Boolean equivalence() {
        if((argument1 == argument2)&&(argument1 != null && argument2 != null))
            return true;
        return true;
    }

    Boolean exclusiveDisjunction() {
        if(argument1!=null && argument2!=null)
            return ((argument1||argument2)&&(!argument1||!argument2));
        return null;
    }

    Boolean implication() {
        if (argument1!=null && argument2!=null)
            return !argument1||argument2;
        else if((argument1!=null && argument1==false)){
            return true;
        }
        else if((argument2!=null && argument2==true)){
            return true;
        }

        return null;
    }

    Boolean notImplication() {
        if(argument1!=null && argument2!=null)
            return !(!argument1||argument2);
        else if((argument1!=null && argument1==false)){
            return false;
        }
        else if((argument2!=null && argument2==true)){
            return false;
        }
        return null;
    }

    Boolean reverseImplication() {
        if(argument1!=null && argument2!=null)
            return argument1||!argument2;
        else if((argument2!=null && argument2==false)){
            return true;
        }
        else if((argument1!=null && argument1==true)){
            return true;
        }
        return null;
    }

    Boolean notReverseImplication() {
        if(argument1!=null && argument2!=null)
            return !(argument1||!argument2);
        else if((argument2!=null && argument2==false)){
            return false;
        }
        else if((argument1!=null && argument1==true)){
            return false;
        }
        return null;
    }

    Boolean pierceArrow() {
        if(argument1!=null && argument2!=null)
            return !argument1&&!argument2;
        else if (argument2!=null&&argument2)
            return false;
        return null;
    }

    Boolean shefferBrush() {
        if(argument1!=null && argument2!=null)
            return (!argument1||!argument2);
        else if (argument2!=null&&!argument2)
            return true;
        return null;
    }

    Boolean repeatFirstArg() {
        return argument1;
    }

    Boolean repeatSecondArg() {
        return argument2;
    }

    Boolean notFirstArg() {
        if (argument1 != null)
            return (!argument1);
        return null;
    }

    Boolean notSecondArg() {
        if (argument2 != null)
            return (!argument2);
        return null;
    }
}
