/**
 * 
 */
package org.vimeoid.dto.simple;

import org.vimeoid.util.SimpleItem;

/**
 * <dl>
 * <dt>Project:</dt> <dd>vimeoid</dd>
 * <dt>Package:</dt> <dd>org.vimeoid.dto.simple</dd>
 * </dl>
 *
 * <code>Operation</code>
 *
 * <p>Vimeo activity representation (named as 'Operation' not to correlate with Android Activities)</p>
 *
 * @author Ulric Wilfred <shaman.sir@gmail.com>
 * @date Aug 19, 2010 9:21:38 PM 
 *
 */
public class Operation implements SimpleItem {
    
    /* public static final Uri CONTENT_URI = Uri.parse("content://" + VimeoProvider.AUTHORITY +
                                                                   "/actions"); */
    
    public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.vimeo.action";
    public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.vimeo.action";
    
    public int type;
    public /*long*/ String date;
    public String[] tags;
    
    public int userId;
    public String userDisplayName;
    public String userProfileUrl;
    
    public String userSmallPortraitUrl;
    public String userMediumPortraitUrl;
    public String userLargePortraitUrl;
    
    public int subjectId;
    public String subjectDisplayName;
    public String subjectUrl;
    
    public String subjectSmallPortraitUrl;
    public String subjectMediumPortraitUrl;
    public String subjectLargePortraitUrl;
    
    public int videoId;
    public String videoTitle;
    public String videoUrl;
    public String videoDescription;
    public String[] videoTags;    
    
    public String videoSmallThumbnailUrl;
    public String videoMediumThumbnailUrl;
    public String videoLargeThumbnailUrl;
    
    public int videoLikesCount;
    public int videoPlaysCount;
    public int videoCommentsCount;

}
