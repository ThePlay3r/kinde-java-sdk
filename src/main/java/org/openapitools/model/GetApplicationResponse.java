package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * GetApplicationResponse
 */

@JsonTypeName("get_application_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-08T18:38:44.963952+05:00[Asia/Karachi]")
public class GetApplicationResponse {

    private String code;

    private String message;

    private GetApplicationResponseApplication application;

    public GetApplicationResponse code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Response code.
     *
     * @return code
     */

    @Schema(name = "code", description = "Response code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public GetApplicationResponse message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Response message.
     *
     * @return message
     */

    @Schema(name = "message", description = "Response message.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public GetApplicationResponse application(GetApplicationResponseApplication application) {
        this.application = application;
        return this;
    }

    /**
     * Get application
     *
     * @return application
     */
    @Valid
    @Schema(name = "application", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("application")
    public GetApplicationResponseApplication getApplication() {
        return application;
    }

    public void setApplication(GetApplicationResponseApplication application) {
        this.application = application;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetApplicationResponse getApplicationResponse = (GetApplicationResponse) o;
        return Objects.equals(this.code, getApplicationResponse.code) &&
                Objects.equals(this.message, getApplicationResponse.message) &&
                Objects.equals(this.application, getApplicationResponse.application);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, application);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetApplicationResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    application: ").append(toIndentedString(application)).append("\n");
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

