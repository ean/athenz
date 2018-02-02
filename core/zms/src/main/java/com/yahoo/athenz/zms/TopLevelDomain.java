//
// This file generated by rdl 1.5.0. Do not modify!
//

package com.yahoo.athenz.zms;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import com.yahoo.rdl.*;

//
// TopLevelDomain - Top Level Domain object. The required attributes include
// the name of the domain and list of domain administrators.
//
public class TopLevelDomain {
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String description;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String org;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean enabled;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean auditEnabled;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String account;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer ypmId;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String applicationId;
    public String name;
    public List<String> adminUsers;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public DomainTemplateList templates;

    public TopLevelDomain setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return description;
    }
    public TopLevelDomain setOrg(String org) {
        this.org = org;
        return this;
    }
    public String getOrg() {
        return org;
    }
    public TopLevelDomain setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return enabled;
    }
    public TopLevelDomain setAuditEnabled(Boolean auditEnabled) {
        this.auditEnabled = auditEnabled;
        return this;
    }
    public Boolean getAuditEnabled() {
        return auditEnabled;
    }
    public TopLevelDomain setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return account;
    }
    public TopLevelDomain setYpmId(Integer ypmId) {
        this.ypmId = ypmId;
        return this;
    }
    public Integer getYpmId() {
        return ypmId;
    }
    public TopLevelDomain setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return applicationId;
    }
    public TopLevelDomain setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return name;
    }
    public TopLevelDomain setAdminUsers(List<String> adminUsers) {
        this.adminUsers = adminUsers;
        return this;
    }
    public List<String> getAdminUsers() {
        return adminUsers;
    }
    public TopLevelDomain setTemplates(DomainTemplateList templates) {
        this.templates = templates;
        return this;
    }
    public DomainTemplateList getTemplates() {
        return templates;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != TopLevelDomain.class) {
                return false;
            }
            TopLevelDomain a = (TopLevelDomain) another;
            if (description == null ? a.description != null : !description.equals(a.description)) {
                return false;
            }
            if (org == null ? a.org != null : !org.equals(a.org)) {
                return false;
            }
            if (enabled == null ? a.enabled != null : !enabled.equals(a.enabled)) {
                return false;
            }
            if (auditEnabled == null ? a.auditEnabled != null : !auditEnabled.equals(a.auditEnabled)) {
                return false;
            }
            if (account == null ? a.account != null : !account.equals(a.account)) {
                return false;
            }
            if (ypmId == null ? a.ypmId != null : !ypmId.equals(a.ypmId)) {
                return false;
            }
            if (applicationId == null ? a.applicationId != null : !applicationId.equals(a.applicationId)) {
                return false;
            }
            if (name == null ? a.name != null : !name.equals(a.name)) {
                return false;
            }
            if (adminUsers == null ? a.adminUsers != null : !adminUsers.equals(a.adminUsers)) {
                return false;
            }
            if (templates == null ? a.templates != null : !templates.equals(a.templates)) {
                return false;
            }
        }
        return true;
    }
}
