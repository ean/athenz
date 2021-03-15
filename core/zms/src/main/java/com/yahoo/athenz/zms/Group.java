//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zms;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import com.yahoo.rdl.*;

//
// Group - The representation for a Group with set of members.
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class Group {
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean selfServe;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean reviewEnabled;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String notifyRoles;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String userAuthorityFilter;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String userAuthorityExpiration;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer memberExpiryDays;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer serviceExpiryDays;
    public String name;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Timestamp modified;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<GroupMember> groupMembers;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<GroupAuditLog> auditLog;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean auditEnabled;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Timestamp lastReviewedDate;

    public Group setSelfServe(Boolean selfServe) {
        this.selfServe = selfServe;
        return this;
    }
    public Boolean getSelfServe() {
        return selfServe;
    }
    public Group setReviewEnabled(Boolean reviewEnabled) {
        this.reviewEnabled = reviewEnabled;
        return this;
    }
    public Boolean getReviewEnabled() {
        return reviewEnabled;
    }
    public Group setNotifyRoles(String notifyRoles) {
        this.notifyRoles = notifyRoles;
        return this;
    }
    public String getNotifyRoles() {
        return notifyRoles;
    }
    public Group setUserAuthorityFilter(String userAuthorityFilter) {
        this.userAuthorityFilter = userAuthorityFilter;
        return this;
    }
    public String getUserAuthorityFilter() {
        return userAuthorityFilter;
    }
    public Group setUserAuthorityExpiration(String userAuthorityExpiration) {
        this.userAuthorityExpiration = userAuthorityExpiration;
        return this;
    }
    public String getUserAuthorityExpiration() {
        return userAuthorityExpiration;
    }
    public Group setMemberExpiryDays(Integer memberExpiryDays) {
        this.memberExpiryDays = memberExpiryDays;
        return this;
    }
    public Integer getMemberExpiryDays() {
        return memberExpiryDays;
    }
    public Group setServiceExpiryDays(Integer serviceExpiryDays) {
        this.serviceExpiryDays = serviceExpiryDays;
        return this;
    }
    public Integer getServiceExpiryDays() {
        return serviceExpiryDays;
    }
    public Group setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return name;
    }
    public Group setModified(Timestamp modified) {
        this.modified = modified;
        return this;
    }
    public Timestamp getModified() {
        return modified;
    }
    public Group setGroupMembers(List<GroupMember> groupMembers) {
        this.groupMembers = groupMembers;
        return this;
    }
    public List<GroupMember> getGroupMembers() {
        return groupMembers;
    }
    public Group setAuditLog(List<GroupAuditLog> auditLog) {
        this.auditLog = auditLog;
        return this;
    }
    public List<GroupAuditLog> getAuditLog() {
        return auditLog;
    }
    public Group setAuditEnabled(Boolean auditEnabled) {
        this.auditEnabled = auditEnabled;
        return this;
    }
    public Boolean getAuditEnabled() {
        return auditEnabled;
    }
    public Group setLastReviewedDate(Timestamp lastReviewedDate) {
        this.lastReviewedDate = lastReviewedDate;
        return this;
    }
    public Timestamp getLastReviewedDate() {
        return lastReviewedDate;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != Group.class) {
                return false;
            }
            Group a = (Group) another;
            if (selfServe == null ? a.selfServe != null : !selfServe.equals(a.selfServe)) {
                return false;
            }
            if (reviewEnabled == null ? a.reviewEnabled != null : !reviewEnabled.equals(a.reviewEnabled)) {
                return false;
            }
            if (notifyRoles == null ? a.notifyRoles != null : !notifyRoles.equals(a.notifyRoles)) {
                return false;
            }
            if (userAuthorityFilter == null ? a.userAuthorityFilter != null : !userAuthorityFilter.equals(a.userAuthorityFilter)) {
                return false;
            }
            if (userAuthorityExpiration == null ? a.userAuthorityExpiration != null : !userAuthorityExpiration.equals(a.userAuthorityExpiration)) {
                return false;
            }
            if (memberExpiryDays == null ? a.memberExpiryDays != null : !memberExpiryDays.equals(a.memberExpiryDays)) {
                return false;
            }
            if (serviceExpiryDays == null ? a.serviceExpiryDays != null : !serviceExpiryDays.equals(a.serviceExpiryDays)) {
                return false;
            }
            if (name == null ? a.name != null : !name.equals(a.name)) {
                return false;
            }
            if (modified == null ? a.modified != null : !modified.equals(a.modified)) {
                return false;
            }
            if (groupMembers == null ? a.groupMembers != null : !groupMembers.equals(a.groupMembers)) {
                return false;
            }
            if (auditLog == null ? a.auditLog != null : !auditLog.equals(a.auditLog)) {
                return false;
            }
            if (auditEnabled == null ? a.auditEnabled != null : !auditEnabled.equals(a.auditEnabled)) {
                return false;
            }
            if (lastReviewedDate == null ? a.lastReviewedDate != null : !lastReviewedDate.equals(a.lastReviewedDate)) {
                return false;
            }
        }
        return true;
    }
}
