package enumdemo;
/**
 * 需求状态枚举
 * @author wangwy20330
 * @version 2017年3月9日下午2:50:53
 */
public enum ReqStatus{
    DRAFT("草稿","1"),
    ACTIVE("激活","2"),
    ALTER("已变更","3"),
    CLOSE("关闭","4"),
    DEL("已删除","0");

    private String code;
    private String name;

    private ReqStatus(String name,String code){
        this.name = name;
        this.code = code;
    }

    public String getName(){
        return name;
    }
    public String getCode(){
        return code;
    }

    public static String getNameByCode(String code){
        for(ReqStatus type : ReqStatus.values()){
            if(type.getCode().equals(code)){
                return type.name;
            }
        }
        return null;
    }
}