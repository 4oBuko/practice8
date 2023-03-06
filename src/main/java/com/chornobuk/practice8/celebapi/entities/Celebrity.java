package com.chornobuk.practice8.celebapi.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldNameConstants;
import lombok.extern.jackson.Jacksonized;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@FieldNameConstants
@JsonInclude(JsonInclude.Include.NON_NULL)
@Document("celebrity")
public class Celebrity {
    @Id
    private String id;

    @JsonProperty("last_job_tittle")
    private String lastJobTitle;

    @JsonProperty("last_name")
    private String lastname;

    @JsonProperty("wiki_uk")
    private String wikiUk;

    @JsonProperty("photo")
    private String photo;

    @JsonProperty("reputation_convictions_en")
    private String reputationConvictionsEn;
    @JsonProperty("first_name_en")
    private String firstNameEn;

    @JsonProperty("last_workplace_en")
    private String lastWorkplaceEn;

    @JsonProperty("names")
    private String names;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("patronymic")
    private String patronymic;

    @JsonProperty("also_known_as_en")
    private String alsoKnownAsEn;

    @JsonProperty("reputation_manhunt_uk")
    private String reputationManhuntUk;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("declarations")
    private List<Declaration> declarations;

    @JsonProperty("reputation_sanctions_uk")
    private String reputationSanctionsUk;

    @JsonProperty("related_companies")
    private List<RelatedCompany> relatedCompanies;

    @JsonProperty("date_of_birth")
    private String dateOfBirth;

    @JsonProperty("patronymic_en")
    private String patronymicEn;

    @JsonProperty("reason_of_termination_en")
    private String reasonOfTerminationEn;

    @JsonProperty("reputation_assets_en")
    private String reputationAssetsEn;

    @JsonProperty("related_persons")
    private List<RelatedPerson> relatedPersons;

    @JsonProperty("reputatoin_convictions_uk")
    private String reputationConvictionsUk;

    @JsonProperty("reputation_crime_en")
    private String reputationCrimesEn;

    @JsonProperty("reason_of_termination")
    private String reasonOfTermination;

    @JsonProperty("full_name_en")
    private String fullNameEn;

    @JsonProperty("city_of_birth_uk")
    private String cityOfBirthUk;

    @JsonProperty("type_of_official")
    private String typeOfOfficial;

    @JsonProperty("died")
    private boolean died;

    @JsonProperty("last_name_en")
    private String lastNameEn;

    @JsonProperty("last_job_tittle_en")
    private String lastJobTitleEn;

    @JsonProperty("is_pep")
    private boolean isPep;

    @JsonProperty("reputation_manhunt_en")
    private String reputationManhuntEn;

    @JsonProperty("also_known_as_uk")
    private String alsoKnownAsUk;

    @JsonProperty("url")
    private String url;

    @JsonProperty("termination_date_human")
    private String terminationDateHuman;

    @JsonProperty("last_workplace")
    private String lastWorkplace;

    @JsonProperty("city_of_birth_en")
    private String cityOfBirthEn;

    @JsonProperty("reputation_sanctions_en")
    private String reputationSanctionsEn;

    @JsonProperty("reputation_crimes_uk")
    private String reputationCrimesUk;

    @JsonProperty("wiki_en")
    private String wikiEn;

    @JsonProperty("reputation_assets_uk")
    private String reputationAssetsUk;

    @JsonProperty("type_of_official_en")
    private String typeOfOfficialEn;
}
