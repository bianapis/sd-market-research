/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class MarketResearchApiServiceImpl implements MarketResearchApiService {

	public MarketResearchRecordResponse record(String crReferenceId, MarketResearchRecordRequest request){
		return JsonReader.read("record-MarketResearchRecordResponse.json",new TypeReference<MarketResearchRecordResponse>(){});
	}
	
	public ReportingBaseWithId requestPost(ReportingBase request){
		return JsonReader.read("requestPost-ReportingBaseWithId.json",new TypeReference<ReportingBaseWithId>(){});
	}
	
	public ReportingBaseWithId requestPut(String crReferenceId, ReportingBase request){
		return JsonReader.read("requestPut-ReportingBaseWithId.json",new TypeReference<ReportingBaseWithId>(){});
	}
	
	public ReportingBaseWithId retrieve(String crReferenceId){
		return JsonReader.read("retrieve-ReportingBaseWithId.json",new TypeReference<ReportingBaseWithId>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public ReportingBaseWithId update(String crReferenceId, ReportingBase request){
		return JsonReader.read("update-ReportingBaseWithId.json",new TypeReference<ReportingBaseWithId>(){});
	}
	
}
