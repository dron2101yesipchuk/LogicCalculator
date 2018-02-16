package sample;

public class LogicActions {
    private Boolean argument1 = null;
    private Boolean argument2 = null;
    private Boolean result = null;
    private String operation = "";


    public void setArgument1(Boolean argument1) {
        this.argument1 = argument1;
    }

    public void setArgument2(Boolean argument2) {
        this.argument2 = argument2;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Boolean getArgument1() {
        return argument1;
    }

    public Boolean getArgument2() {
        return argument2;
    }

    public Boolean getResult() {
        return result;
    }

    void conjunction(){
        operation = "conjunction";
        if (argument1!=null&&argument2!=null){
            this.result = argument1&&argument2;
        }
        else if((argument1!=null&&argument1 == false) || (argument2!=null&&argument2 == false)){
            this.result = false;
        }
        this.result = null;
    }

    void disjunction(){
        operation = "disjunction";
        if (argument1!=null&&argument2!=null)
            this.result = argument1||argument2;
        else if ((argument1!=null&&argument1 == true) || (argument2!=null&&argument2 == true))
            this.result = true;
        this.result = null;
    }

    void constTrue(){
        operation = "const true";
        this.result = true;
    }

    void constFalse() {
        operation = "const false";
        this.result = false;
    }

    void equivalence() {
        operation = "equivalence";
        if((argument1 == argument2)&&(argument1 != null && argument2 != null))
            this.result = true;
        this.result = false;
    }

    void exclusiveDisjunction() {
        operation = "exclusive disjunction";
        if(argument1!=null && argument2!=null)
            this.result = ((argument1||argument2)&&(!argument1||!argument2));
        this.result = null;
    }

    void implication() {
        operation = "implication";
        if(argument1!=null && argument2!=null)
            this.result = !argument1||argument2;
        this.result = null;
    }

    void notImplication() {
        operation = "not implication";
        if(argument1!=null && argument2!=null)
            this.result = !(!argument1||argument2);
        this.result = null;
    }

    void notReverseImplication() {
        operation = "not reverse implication";
        if(argument1!=null && argument2!=null)
            this.result = !(argument1||!argument2);
        this.result = null;
    }

    void pierceArrow() {
        operation = "pierce arrow";
        if(argument1!=null && argument2!=null)
            this.result = !argument1&&!argument2;
        this.result = null;
    }

    void reverseImplication() {
        operation = "reverse implication";
        if(argument1!=null && argument2!=null)
            this.result = argument1||!argument2;
        this.result = null;
    }

    void shefferBrush() {
        operation = "sheffer brush";
        if(argument1!=null && argument2!=null)
            this.result = (!argument1||!argument2);
        this.result = null;
    }

    void repeatFirstArg() {
        operation = "repeat first arg";
        this.result = argument1;
    }

    void repeatSecondArg() {
        operation = "repeat second arg";
        this.result = argument2;
    }

    void notFirstArg() {
        operation = "not first arg";
        if (argument1 != null)
            this.result = (!argument1);
        this.result = null;
    }

    void notSecondArg() {
        operation = "not second arg";
        if (argument2 != null)
            this.result = (!argument2);
        this.result = null;
    }

    @Override
    public String toString() {
        return  "{argument1:" + argument1 +
                ", argument2:" + argument2 +
                ", operation:'" + operation +
                ", result:" + result +
                '}';
    }


}
