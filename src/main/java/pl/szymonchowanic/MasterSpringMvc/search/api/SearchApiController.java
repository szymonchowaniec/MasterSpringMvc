package pl.szymonchowanic.MasterSpringMvc.search.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.web.bind.annotation.*;
import pl.szymonchowanic.MasterSpringMvc.search.LightTweet;
import pl.szymonchowanic.MasterSpringMvc.search.SearchService;

import java.util.List;
@RestController
@RequestMapping("/api/search")
public class SearchApiController {
	private SearchService searchService;
	@Autowired
	public SearchApiController(SearchService searchService) {
		this.searchService = searchService;
	}
	@RequestMapping(value = "/{searchType}", method = RequestMethod.GET)
	public List<LightTweet> search(@PathVariable String searchType,
								   @MatrixVariable List<String> keywords) {
		return searchService.search(searchType, keywords);
	}
}
