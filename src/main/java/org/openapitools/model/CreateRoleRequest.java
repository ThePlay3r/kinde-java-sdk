package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * CreateRoleRequest
 */

@JsonTypeName("CreateRole_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-08T18:38:44.963952+05:00[Asia/Karachi]")
public class CreateRoleRequest {

    private String name;

    private String description;

    private String key;

    private Boolean isDefaultRole;

    public CreateRoleRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The role's name.
     *
     * @return name
     */

    @Schema(name = "name", description = "The role's name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateRoleRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The role's description.
     *
     * @return description
     */

    @Schema(name = "description", description = "The role's description.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateRoleRequest key(String key) {
        this.key = key;
        return this;
    }

    /**
     * The role identifier to use in code.
     *
     * @return key
     */

    @Schema(name = "key", description = "The role identifier to use in code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public CreateRoleRequest isDefaultRole(Boolean isDefaultRole) {
        this.isDefaultRole = isDefaultRole;
        return this;
    }

    /**
     * Set role as default for new users.
     *
     * @return isDefaultRole
     */

    @Schema(name = "is_default_role", description = "Set role as default for new users.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_default_role")
    public Boolean getIsDefaultRole() {
        return isDefaultRole;
    }

    public void setIsDefaultRole(Boolean isDefaultRole) {
        this.isDefaultRole = isDefaultRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRoleRequest createRoleRequest = (CreateRoleRequest) o;
        return Objects.equals(this.name, createRoleRequest.name) &&
                Objects.equals(this.description, createRoleRequest.description) &&
                Objects.equals(this.key, createRoleRequest.key) &&
                Objects.equals(this.isDefaultRole, createRoleRequest.isDefaultRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, key, isDefaultRole);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRoleRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    isDefaultRole: ").append(toIndentedString(isDefaultRole)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

