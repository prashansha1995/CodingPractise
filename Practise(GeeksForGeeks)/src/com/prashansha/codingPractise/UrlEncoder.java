package com.prashansha.codingPractise;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UrlEncoder {
	public static Map<String, List<String>> splitQuery(URL url) throws UnsupportedEncodingException, MalformedURLException {
	
		
		  final Map<String, List<String>> query_pairs = new LinkedHashMap<String, List<String>>();
		  final String[] pairs = url.getQuery().split("&");
		  for (String pair : pairs) {
		    final int idx = pair.indexOf("=");
		    final String key = idx > 0 ? URLDecoder.decode(pair.substring(0, idx), "UTF-8") : pair;
		    if (!query_pairs.containsKey(key)) {
		      query_pairs.put(key, new LinkedList<String>());
		    }
		    final String value = idx > 0 && pair.length() > idx + 1 ? URLDecoder.decode(pair.substring(idx + 1), "UTF-8") : null;
		    query_pairs.get(key).add(value);
		  }
		  return query_pairs;
		}
	
	public static void main(String[] args) throws UnsupportedEncodingException, MalformedURLException {
		Map<String, List<String>> query_pairs=UrlEncoder.splitQuery(new
				URL("https://stackoverflow.com?CorrelationId=1&PickedNumbers%5B%5D=1&PickedNumbers%5B%5D=2&PickedNumbers%5B%5D=3&PickedNumbers%5B%5D=4"));
		System.out.println(query_pairs);
	}
}
