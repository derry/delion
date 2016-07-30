package org.chromium.chrome.browser;
import org.chromium.chrome.R.drawable;
/**
 * Created by yangdeli on 16-7-20.
 */

public class ResourceId {
    public ResourceId() {
    }

    public static int mapToDrawableId(int enumeratedId) {
        int[] resourceList = new int[]{0, drawable.infobar_3d_blocked, drawable.infobar_autofill_cc, drawable.infobar_camera, drawable.infobar_microphone, drawable.infobar_midi, drawable.infobar_multiple_downloads, drawable.infobar_savepassword, drawable.infobar_warning, drawable.infobar_translate, drawable.infobar_blocked_popups, drawable.infobar_protected_media_identifier, drawable.infobar_desktop_notifications, drawable.infobar_geolocation, drawable.infobar_restore, drawable.pageinfo_good, drawable.pageinfo_warning, drawable.pageinfo_bad, drawable.pageinfo_warning, drawable.pageinfo_warning, drawable.pageinfo_warning, drawable.amex_card, drawable.discover_card, drawable.generic_card, drawable.mc_card, drawable.visa_card, 17301559, drawable.ic_photo_camera, drawable.cvc_icon, drawable.cvc_icon_amex, drawable.ic_settings, drawable.pr_amex, drawable.pr_discover, drawable.pr_generic, drawable.pr_mc, drawable.pr_visa};
        if(enumeratedId >= 0 && enumeratedId < resourceList.length) {
            return resourceList[enumeratedId];
        } else {
            assert false : "enumeratedId \'" + enumeratedId + "\' was out of range.";

            return drawable.missing;
        }
    }
}