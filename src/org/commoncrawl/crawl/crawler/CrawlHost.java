/**
 * Copyright 2008 - CommonCrawl Foundation
 * 
 * CommonCrawl licenses this file to you under the Apache License, 
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.commoncrawl.crawl.crawler;

/**
 * An abstraction of a single crawlable host (identified by an IP Address)
 * 
 * @author rana
 *
 */
public interface CrawlHost {

	public int getIPAddress();

	public String getIPAddressAsString();

	public boolean isIdled();
	
	public void    setIdle(boolean isIdle);
	
	public void 	 updateLastModifiedTime(long lastModifiedTime);
	
	public long 	 getLastModifiedTime();
	
	/** returns the active list **/
	public CrawlList getActiveList();

}
