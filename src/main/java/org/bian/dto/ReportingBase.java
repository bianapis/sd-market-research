package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ReportingBase
 */
public class ReportingBase   {
  private Object marketResearchReportRequest = null;

  private String employeeBusinessUnitReference = null;

  private String marketResearchSourceReference = null;

  private String marketResearchReportTypeReference = null;

  private String marketResearchReportVersionPeriod = null;

  private Object marketResearchReport = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: 'the details of the research request' 
   * @return marketResearchReportRequest
  **/

  public Object getMarketResearchReportRequest() {
    return marketResearchReportRequest;
  }

  public void setMarketResearchReportRequest(Object marketResearchReportRequest) {
    this.marketResearchReportRequest = marketResearchReportRequest;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'the employee/business unit requesting the research report' 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'reference to sources of market research reports and databases' 
   * @return marketResearchSourceReference
  **/

  public String getMarketResearchSourceReference() {
    return marketResearchSourceReference;
  }

  public void setMarketResearchSourceReference(String marketResearchSourceReference) {
    this.marketResearchSourceReference = marketResearchSourceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'reference to a specific market research report or database' 
   * @return marketResearchReportTypeReference
  **/

  public String getMarketResearchReportTypeReference() {
    return marketResearchReportTypeReference;
  }

  public void setMarketResearchReportTypeReference(String marketResearchReportTypeReference) {
    this.marketResearchReportTypeReference = marketResearchReportTypeReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Indicator general-info: 'defines the specific report instance of a report type by version or date' 
   * @return marketResearchReportVersionPeriod
  **/

  public String getMarketResearchReportVersionPeriod() {
    return marketResearchReportVersionPeriod;
  }

  public void setMarketResearchReportVersionPeriod(String marketResearchReportVersionPeriod) {
    this.marketResearchReportVersionPeriod = marketResearchReportVersionPeriod;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: 'tthe content of a specific report or database in any suitable form' 
   * @return marketResearchReport
  **/

  public Object getMarketResearchReport() {
    return marketResearchReport;
  }

  public void setMarketResearchReport(Object marketResearchReport) {
    this.marketResearchReport = marketResearchReport;
  }


}

