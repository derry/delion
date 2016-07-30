package org.chromium.chrome.browser;

/**
 * Created by yangdeli on 16-7-20.
 */
public class TabLoadStatus {
    public static final int PAGE_LOAD_FAILED = 0;
    public static final int DEFAULT_PAGE_LOAD = 1;
    public static final int PARTIAL_PRERENDERED_PAGE_LOAD = 2;
    public static final int FULL_PRERENDERED_PAGE_LOAD = 3;

    public TabLoadStatus() {
    }
}
