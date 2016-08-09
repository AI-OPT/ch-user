package com.ai.ch.user.constants;

public class ExceptCodeConstants {
    /**
     * 成功
     */
    public static final String SUCCESS = "000000";
    
    /**
     * 失败
     */
    
    public static final String FAILD="0";

    /**
     * 参数为空
     */
    public static final String PARAM_IS_NULL = "888888";

    /**
     * 查询无记录
     */
    public static final String NO_RESULT = "000001";

    /**
     * 参数类型不正确
     */
    public static final String PARAM_TYPE_NOT_RIGHT = "000002";
    
    /**
     * 参数取值有误
     */
    public static final String PARAM_IS_WRONG = "000004";

    /**
     * 未配置系统参数或未刷新缓存
     */
    public static final String NO_DATA_OR_CACAE_ERROR = "000003";
    /**
     * 系统异常
     */
    public static final String SYSTEM_ERROR="999999";
    /**
     * 用户状态非正常
     */
    public static final String USER_NOT_NORMAL="100001";
    
    public static final class Account {
        private Account() {
        }
        
        /*
         * 11：注册
        10：正常
        12：冻结
         */
        
        public static final String REGISTER_STATE="11";
        
        public static final String REGISTER_NORMAL="10";
        
        public static final String REGISTER_FREEZE="12";
        
        // 账户设置资料验证失败
        public static final String ACCOUNT_NOT_FOUND = "100001";

        // 账户设置资料验证失败
        public static final String ACCOUNT_SET_INFO_CHECK_FAILED = "100001";

    }
    
    public static final class Subject{
        private Subject(){
        }
        public static final String SUBJECT_NOT_FOUND = "200001";
        public static final String SUBJECT_NOT_VALID = "200002";
    }
    
    public static final class FunBook{
        private FunBook(){
        }
        public static final String BOOK_NOT_FOUND = "300001";
        public static final String BALANCE_NOT_ENOUGH = "300002";
        public static final String VERSION_EXPORE = "300003";
    }
}
