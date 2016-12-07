package com.ai.ch.user.util;

import com.ai.opt.sdk.components.sequence.util.SeqUtil;
import com.ai.ch.user.constants.SequenceCodeConstants;

/**
 * 用户SequenceCode生成工具
 * 生成表字段主键自增序列号
 */
public final class SequenceUtil {

	public static String createApiSeqId() {
		return SeqUtil.getNewId(SequenceCodeConstants.UserSequenceCode.UC_API_INFO$API_SEQ_ID$SEQ, 18);
	}

	public static String createBankSeqId() {
		return SeqUtil.getNewId(SequenceCodeConstants.UserSequenceCode.UC_BANK_INFO$BANK_SEQ_ID$SEQ, 18);
	}

	public static String createContactSeqId() {
		return SeqUtil.getNewId(SequenceCodeConstants.UserSequenceCode.UC_CONTACTS_INFO$CONTACT_SEQ_ID$SEQ, 18);
	}

	public static String createLoginSeqId() {
		return SeqUtil.getNewId(SequenceCodeConstants.UserSequenceCode.UC_LOGIN_LOG$LOGIN_SEQ_ID$SEQ, 18);
	}

	public static Long createInfoSpecialId() {
		return SeqUtil.getNewId(SequenceCodeConstants.UserSequenceCode.UC_SPECIAL_INFO$INFO_SPECIAL_ID$SEQ);
	}

	public static String createStateChgId() {
		return SeqUtil.getNewId(SequenceCodeConstants.UserSequenceCode.UC_STATE_CHG$STATE_CHG_ID$SEQ, 18);
	}

	public static String createUserId() {
		return SeqUtil.getNewId(SequenceCodeConstants.UserSequenceCode.UC_USER$USER_ID$SEQ, 18);
	}

	public static String createAgreeSeqId() {
		return SeqUtil.getNewId(SequenceCodeConstants.UserSequenceCode.UC_USER_AGREE$AGREE_SEQ_ID$SEQ, 18);
	}

	public static String createFavoriteSeqId() {
		return SeqUtil.getNewId(SequenceCodeConstants.UserSequenceCode.UC_USER_AGREE$AGREE_SEQ_ID$SEQ, 18);
	}

	public static String createInfoSeqId() {
		return SeqUtil.getNewId(SequenceCodeConstants.UserSequenceCode.UC_USER_MESSAGE$INFO_SEQ_ID$SEQ, 18);
	}

	public static String createSafariSeqId() {
		return SeqUtil.getNewId(SequenceCodeConstants.UserSequenceCode.UC_USER_SAFARI$SAFARI_SEQ_ID$SEQ, 18);
	}

	public static String createCardSeqId() {
		return SeqUtil.getNewId(SequenceCodeConstants.UserSequenceCode.UC_USER_SUBS$CARD_SEQ_ID$SEQ, 18);
	}

	public static String createPhoneSeqId() {
		return SeqUtil.getNewId(SequenceCodeConstants.UserSequenceCode.UC_USER$USER_ID$SEQ, 7);
	}

	public static String createTelGroupId() {
		long seq = SeqUtil.getNewId(SequenceCodeConstants.UserSequenceCode.UC_TEL_GROUP$TEL_GROUP_ID$SEQ);
		return String.valueOf(seq);
	}

	public static String createTelNo() {
		long seq = SeqUtil.getNewId(SequenceCodeConstants.UserSequenceCode.UC_USER_PHONEBOOKS$TEL_NO$SEQ);
		return String.valueOf(seq);
	}
	public static String createInfoExtId() {
	    long seq = SeqUtil.getNewId(SequenceCodeConstants.UserSequenceCode.CM_CUST_FILE_EXT$INFO_EXT$ID);
	    return String.valueOf(seq);
	}
	public static String createLogId() {
		long seq = SeqUtil.getNewId(SequenceCodeConstants.UserSequenceCode.CT_AUDIT_LOG$LOG_SEQ_ID$SEQ);
		return String.valueOf(seq);
	}

}
