package example.model.customer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties (ignoreUnknown=true)
class Name
{
    private final String familyName;

    private final String firstName;

    Name( @JsonProperty("familyName") String familyName
            , @JsonProperty("firstName") String firstName )
    {
        this.firstName = firstName;
        this.familyName = familyName;
    }

    String fullName()
    {
        return String.format( "%s %s", this.familyName, this.firstName );
    }
}
