//
// This file generated by rdl 1.5.0
//

package com.yahoo.athenz.provider;
import com.yahoo.rdl.*;

public class ProviderSchema {

    private final static Schema INSTANCE = build();
    public static Schema instance() {
        return INSTANCE;
    }

    private static Schema build() {
        SchemaBuilder sb = new SchemaBuilder("Provider");
        sb.version(1);
        sb.namespace("com.yahoo.athenz.provider");
        sb.comment("Copyright 2016 Yahoo Inc. Licensed under the terms of the Apache version 2.0 license. See LICENSE file for terms. This \"service\" definition is just to provide a generic client stub for any service implementing the provider API");

        sb.stringType("SimpleName")
            .comment("Copyright 2016 Yahoo Inc. Licensed under the terms of the Apache version 2.0 license. See LICENSE file for terms. Common name types used by several API definitions A simple identifier, an element of compound name.")
            .pattern("[a-zA-Z0-9_][a-zA-Z0-9_-]*");

        sb.stringType("CompoundName")
            .comment("A compound name. Most names in this API are compound names.")
            .pattern("([a-zA-Z0-9_][a-zA-Z0-9_-]*\\.)*[a-zA-Z0-9_][a-zA-Z0-9_-]*");

        sb.stringType("DomainName")
            .comment("A domain name is the general qualifier prefix, as its uniqueness is managed.")
            .pattern("([a-zA-Z0-9_][a-zA-Z0-9_-]*\\.)*[a-zA-Z0-9_][a-zA-Z0-9_-]*");

        sb.stringType("EntityName")
            .comment("An entity name is a short form of a resource name, including only the domain and entity.")
            .pattern("([a-zA-Z0-9_][a-zA-Z0-9_-]*\\.)*[a-zA-Z0-9_][a-zA-Z0-9_-]*");

        sb.stringType("ServiceName")
            .comment("A service name will generally be a unique subdomain.")
            .pattern("([a-zA-Z0-9_][a-zA-Z0-9_-]*\\.)*[a-zA-Z0-9_][a-zA-Z0-9_-]*");

        sb.stringType("LocationName")
            .comment("A location name is not yet defined, but will be a dotted name like everything else.")
            .pattern("([a-zA-Z0-9_][a-zA-Z0-9_-]*\\.)*[a-zA-Z0-9_][a-zA-Z0-9_-]*");

        sb.stringType("ActionName")
            .comment("An action (operation) name.")
            .pattern("([a-zA-Z0-9_][a-zA-Z0-9_-]*\\.)*[a-zA-Z0-9_][a-zA-Z0-9_-]*");

        sb.stringType("ResourceName")
            .comment("A resource name Note that the EntityName part is optional, that is, a domain name followed by a colon is valid resource name.")
            .pattern("([a-zA-Z0-9_][a-zA-Z0-9_-]*\\.)*[a-zA-Z0-9_][a-zA-Z0-9_-]*(:([a-zA-Z0-9_][a-zA-Z0-9_-]*\\.)*[a-zA-Z0-9_][a-zA-Z0-9_-]*)?");

        sb.stringType("YBase64")
            .comment("The Y-specific URL-safe Base64 variant.")
            .pattern("[a-zA-Z0-9\\._-]+");

        sb.stringType("YEncoded")
            .comment("YEncoded includes ybase64 chars, as well as = and %. This can represent a user cookie and URL-encoded values.")
            .pattern("[a-zA-Z0-9\\._%=-]*");

        sb.stringType("AuthorityName")
            .comment("Used as the prefix in a signed assertion. This uniquely identifies a signing authority.")
            .pattern("([a-zA-Z0-9_][a-zA-Z0-9_-]*\\.)*[a-zA-Z0-9_][a-zA-Z0-9_-]*");

        sb.stringType("SignedToken")
            .comment("A signed assertion if identity. i.e. the user cookie value. This token will only make sense to the authority that generated it, so it is beneficial to have something in the value that is cheaply recognized to quickly reject if it belongs to another authority. In addition to the YEncoded set our token includes ; to separate components and , to separate roles and : for IPv6 addresses")
            .pattern("[a-zA-Z0-9\\._%=:;,-]*");

        sb.stringType("MemberName")
            .comment("Role Member name - could be one of three values: *, DomainName.* or ServiceName[*]")
            .pattern("\\*|([a-zA-Z0-9_][a-zA-Z0-9_-]*\\.)*[a-zA-Z0-9_][a-zA-Z0-9_-]*\\.\\*|([a-zA-Z0-9_][a-zA-Z0-9_-]*\\.)*[a-zA-Z0-9_][a-zA-Z0-9_-]*(\\*)?");

        sb.enumType("TenantState")
            .element("INACTIVE")
            .element("PENDING")
            .element("ACTIVE");

        sb.structType("Tenant")
            .field("service", "SimpleName", false, "name of the service")
            .field("name", "DomainName", false, "name of the tenant domain in this service. Must be a valid domain name the caller has rights to")
            .field("state", "TenantState", true, "the state of the tenant", TenantState.ACTIVE)
            .arrayField("roles", "EntityName", true, "the roles this tenant may assume. Determined by and returned by this service")
            .arrayField("resourceGroups", "EntityName", true, "registered resource groups for this tenant");

        sb.structType("TenantResourceGroup")
            .field("service", "SimpleName", false, "name of the service")
            .field("name", "DomainName", false, "name of the tenant domain in this service. Must be a valid domain name the caller has rights to")
            .field("resourceGroup", "EntityName", false, "resource group for this tenant")
            .arrayField("roles", "EntityName", true, "the roles this tenant may assume. Determined by and returned by this service");


        sb.resource("Tenant", "PUT", "/service/{service}/tenant/{tenant}")
            .comment("Create a new tenant in this provider note optional 3rd arg in this case -- it is unusual!")
            .pathParam("service", "SimpleName", "name of the service")
            .pathParam("tenant", "DomainName", "name of the tenant domain in this service")
            .headerParam("Y-Audit-Ref", "auditRef", "String", null, "Audit param required(not empty) if domain auditEnabled is true.")
            .input("template", "Tenant", "")
            .auth("assume_role", "role.{service}.tenant.{tenant}.admin", false, "{tenant}")
            .expected("OK")
            .exception("ACCEPTED", "Tenant", "")

            .exception("BAD_REQUEST", "ResourceError", "")

            .exception("CONFLICT", "ResourceError", "")

            .exception("FORBIDDEN", "ResourceError", "")

            .exception("UNAUTHORIZED", "ResourceError", "")
;

        sb.resource("Tenant", "GET", "/service/{service}/tenant/{tenant}")
            .comment("Get information about the tenant")
            .pathParam("service", "SimpleName", "name of the service")
            .pathParam("tenant", "DomainName", "name of the tenant domain in this service")
            .auth("", "", true)
            .expected("OK")
            .exception("BAD_REQUEST", "ResourceError", "")

            .exception("FORBIDDEN", "ResourceError", "")

            .exception("NOT_FOUND", "ResourceError", "")

            .exception("UNAUTHORIZED", "ResourceError", "")
;

        sb.resource("Tenant", "DELETE", "/service/{service}/tenant/{tenant}")
            .comment("Remove a tenant and all its resources. Upon successful completion of this delete request, the server will return NO_CONTENT status code without any data (no object will be returned).")
            .pathParam("service", "SimpleName", "name of the service")
            .pathParam("tenant", "DomainName", "name of the tenant domain in this service")
            .headerParam("Y-Audit-Ref", "auditRef", "String", null, "Audit param required(not empty) if domain auditEnabled is true.")
            .auth("assume_role", "role.{service}.tenant.{tenant}.admin", false, "{tenant}")
            .expected("NO_CONTENT")
            .exception("BAD_REQUEST", "ResourceError", "")

            .exception("CONFLICT", "ResourceError", "")

            .exception("FORBIDDEN", "ResourceError", "")

            .exception("NOT_FOUND", "ResourceError", "")

            .exception("UNAUTHORIZED", "ResourceError", "")
;

        sb.resource("TenantResourceGroup", "PUT", "/service/{service}/tenant/{tenant}/resourceGroup/{resourceGroup}")
            .comment("Create a new resource group for this tenant in this provider. The tenant must already be registered with the provider")
            .pathParam("service", "SimpleName", "name of the service")
            .pathParam("tenant", "DomainName", "name of the tenant domain in this service")
            .pathParam("resourceGroup", "EntityName", "tenant resource group")
            .headerParam("Y-Audit-Ref", "auditRef", "String", null, "Audit param required(not empty) if domain auditEnabled is true.")
            .input("template", "TenantResourceGroup", "")
            .auth("assume_role", "role.{service}.tenant.{tenant}.admin", false, "{tenant}")
            .expected("OK")
            .exception("ACCEPTED", "Tenant", "")

            .exception("BAD_REQUEST", "ResourceError", "")

            .exception("CONFLICT", "ResourceError", "")

            .exception("FORBIDDEN", "ResourceError", "")

            .exception("UNAUTHORIZED", "ResourceError", "")
;

        sb.resource("TenantResourceGroup", "DELETE", "/service/{service}/tenant/{tenant}/resourceGroup/{resourceGroup}")
            .comment("Remove the specified resource group from this tenant and all its resources.")
            .pathParam("service", "SimpleName", "name of the service")
            .pathParam("tenant", "DomainName", "name of the tenant domain in this service")
            .pathParam("resourceGroup", "EntityName", "tenant resource group")
            .headerParam("Y-Audit-Ref", "auditRef", "String", null, "Audit param required(not empty) if domain auditEnabled is true.")
            .auth("assume_role", "role.{service}.tenant.{tenant}.admin", false, "{tenant}")
            .expected("NO_CONTENT")
            .exception("BAD_REQUEST", "ResourceError", "")

            .exception("CONFLICT", "ResourceError", "")

            .exception("FORBIDDEN", "ResourceError", "")

            .exception("NOT_FOUND", "ResourceError", "")

            .exception("UNAUTHORIZED", "ResourceError", "")
;


        return sb.build();
    }

}
