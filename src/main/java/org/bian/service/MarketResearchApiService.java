/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface MarketResearchApiService {

	MarketResearchRecordResponse record(String crReferenceId, MarketResearchRecordRequest request);
	
	ReportingBaseWithId requestPost(ReportingBase request);
	
	ReportingBaseWithId requestPut(String crReferenceId, ReportingBase request);
	
	ReportingBaseWithId retrieve(String crReferenceId);
	
	List<String> retrieveRefIds();
	
	ReportingBaseWithId update(String crReferenceId, ReportingBase request);
	
}
