package domain;

public enum Sensitivity {
    LOW(0),
    MEDIUM(1),
    HIGH(2);
    private Integer level;
    Sensitivity(int level){
        this.level = level;
    }
    private static Sensitivity fromLevel(int level){
        for(Sensitivity s: Sensitivity.values()){
            if(s.level == level){
                return s;
            }
        }
        return null;
    }
}
