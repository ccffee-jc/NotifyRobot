package com.ccffee.NotifyRobot.service;

import java.util.HashMap;

public interface CqMessageATGroupOtherMemberService {
    HashMap messageDistributor(String message, String groupId, String userId);
}
