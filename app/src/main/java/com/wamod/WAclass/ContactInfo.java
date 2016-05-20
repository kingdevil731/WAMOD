package com.wamod.WAclass;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.wamod.Privacy;
import com.wamod.Resources;
import com.wamod.Utils;
import com.whatsapp.qj;

/**
 * Created by brianvalente on 9/20/15.
 */
public class ContactInfo extends AppCompatActivity {
    public static void _onCreate(final AppCompatActivity a) {
        try {
            if (Utils.nightModeShouldRun()) {
                final ViewGroup content = (ViewGroup) a.findViewById(android.R.id.content);
                content.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    @Override
                    public void onGlobalLayout() {

                        ViewGroup wamod_privacy_card = (ViewGroup) a.findViewById(Resources.getID("wamod_privacy_card"));
                        TextView wamod_privacy_card_reportreceived_title = (TextView) a.findViewById(Resources.getID("wamod_privacy_card_reportreceived_title"));
                        TextView wamod_privacy_card_reportreceived_summary = (TextView) a.findViewById(Resources.getID("wamod_privacy_card_reportreceived_summary"));
                        TextView wamod_privacy_card_reportread_title = (TextView) a.findViewById(Resources.getID("wamod_privacy_card_reportread_title"));
                        TextView wamod_privacy_card_reportread_summary = (TextView) a.findViewById(Resources.getID("wamod_privacy_card_reportread_summary"));
                        TextView wamod_privacy_card_hidetyping_title = (TextView) a.findViewById(Resources.getID("wamod_privacy_card_hidetyping_title"));
                        TextView wamod_privacy_card_hidetyping_summary = (TextView) a.findViewById(Resources.getID("wamod_privacy_card_hidetyping_summary"));
                        wamod_privacy_card.setBackgroundColor(Utils.getDarkColor(3));
                        wamod_privacy_card_reportreceived_title.setTextColor(Utils.getDarkColor(0));
                        wamod_privacy_card_reportreceived_summary.setTextColor(Utils.getDarkColor(1));
                        wamod_privacy_card_reportread_title.setTextColor(Utils.getDarkColor(0));
                        wamod_privacy_card_reportread_summary.setTextColor(Utils.getDarkColor(1));
                        wamod_privacy_card_hidetyping_title.setTextColor(Utils.getDarkColor(0));
                        wamod_privacy_card_hidetyping_summary.setTextColor(Utils.getDarkColor(1));

                        ListView list = (ListView) a.findViewById(android.R.id.list);
                        list.setBackgroundColor(Utils.getDarkColor(2));

                        ViewGroup media_card = (ViewGroup) a.findViewById(Resources.id.media_card);
                        ViewGroup media_card_2 = (ViewGroup) media_card.getChildAt(0);
                        TextView media_title = (TextView) a.findViewById(Resources.id.media_title);
                        TextView media_info = (TextView) a.findViewById(Resources.id.media_info);
                        //if (media_card_2 != null) media_card_2.setBackground(utils.tintToColor(media_card_2.getBackground(), utils.getDarkColor(3)));
                        if (media_card_2 != null) media_card_2.setBackgroundColor(Utils.getDarkColor(3));
                        if (media_title != null) media_title.setTextColor(Utils.getDarkColor(0));
                        if (media_info != null) media_info.setTextColor(Utils.getDarkColor(1));

                        TextView status = (TextView) a.findViewById(Resources.id.status);
                        TextView status_info = (TextView) a.findViewById(Resources.id.status_info);
                        TextView title_tv = (TextView) a.findViewById(Resources.id.title_tv);
                        TextView subtitle_tv = (TextView) a.findViewById(Resources.id.subtitle_tv);
                        ImageView primary_action_icon = (ImageView) a.findViewById(Resources.id.primary_action_icon);
                        ImageView secondary_action_btn = (ImageView) a.findViewById(Resources.id.secondary_action_btn);
                        ViewGroup phoneAndStatusContainer = (ViewGroup) status.getParent();
                        TextView phoneAndStatusTV = (TextView) ((ViewGroup) phoneAndStatusContainer.getChildAt(0)).getChildAt(0);
                        phoneAndStatusContainer.setBackgroundColor(Utils.getDarkColor(3));
                        primary_action_icon.setImageDrawable(Utils.tintToColor(primary_action_icon.getDrawable(), Utils.getDarkColor(1)));
                        secondary_action_btn.setImageDrawable(Utils.tintToColor(secondary_action_btn.getDrawable(), Utils.getDarkColor(1)));
                        phoneAndStatusTV.setTextColor(Utils.getDarkColor(0));
                        status.setTextColor(Utils.getDarkColor(1));
                        status_info.setTextColor(Utils.getDarkColor(1));
                        title_tv.setTextColor(Utils.getDarkColor(1));
                        subtitle_tv.setTextColor(Utils.getDarkColor(1));

                        ViewGroup mute_layout = (ViewGroup) a.findViewById(Resources.id.mute_layout);
                        ViewGroup muteContainer = (ViewGroup) mute_layout.getParent();
                        TextView muteTV = (TextView) ((ViewGroup) mute_layout.getChildAt(0)).getChildAt(0);
                        TextView customNotificationsTV = (TextView) ((ViewGroup) a.findViewById(Resources.id.notifications_layout)).getChildAt(0);

                        TextView starred_messages_btn = (TextView) a.findViewById(Resources.id.starred_messages_btn);
                        TextView starred_messages_count = (TextView) a.findViewById(Resources.id.starred_messages_count);
                        starred_messages_btn.setTextColor(Utils.getDarkColor(0));
                        starred_messages_count.setTextColor(Utils.getDarkColor(1));

                        TextView encryption_info = (TextView) a.findViewById(Resources.id.encryption_info);
                        if (encryption_info != null) {
                            TextView encryption_title = (TextView) ((ViewGroup) encryption_info.getParent()).getChildAt(0);
                            ImageView encryption_indicator = (ImageView) a.findViewById(Resources.id.encryption_indicator);

                            encryption_title.setTextColor(Utils.getDarkColor(0));
                            encryption_info.setTextColor(Utils.getDarkColor(1));
                            encryption_indicator.setImageDrawable(Utils.tintToColor(encryption_indicator.getDrawable(), Utils.getDarkColor(0)));
                        }

                        muteContainer.setBackgroundColor(Utils.getDarkColor(3));
                        muteTV.setTextColor(Utils.getDarkColor(0));
                        customNotificationsTV.setTextColor(Utils.getDarkColor(0));

                        TextView groups_title = (TextView) a.findViewById(Resources.id.groups_title);
                        ViewGroup groupsheader = (ViewGroup) groups_title.getParent();
                        groups_title.setTextColor(Utils.getDarkColor(0));
                        groupsheader.setBackgroundColor(Utils.getDarkColor(3));

                        content.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                });
            }
        } catch (Exception e) {
            Utils.manageException(e);
        }

        SwitchCompat reportReadSwitch     = (SwitchCompat) a.findViewById(Resources.getID("wamod_privacy_card_reportread_switch"));
        SwitchCompat reportReceivedSwitch = (SwitchCompat) a.findViewById(Resources.getID("wamod_privacy_card_reportreceived_switch"));
        SwitchCompat hideTypingSwitch     = (SwitchCompat) a.findViewById(Resources.getID("wamod_privacy_card_hidetyping_switch"));
        com.whatsapp.ContactInfo contactInfo = (com.whatsapp.ContactInfo) a;
        com.whatsapp.qj contact = contactInfo.f(contactInfo);
        final String JabberID = contact.r;

        if (Privacy.contactAffectedByBlueTickMod(JabberID))
            reportReadSwitch.setChecked(false);
        else
            reportReadSwitch.setChecked(true);

        if (Privacy.contactAffectedBySecondTickMod(JabberID))
            reportReceivedSwitch.setChecked(false);
        else
            reportReceivedSwitch.setChecked(true);

        if (Privacy.contactAffectedByHideTypingMod(JabberID))
            hideTypingSwitch.setChecked(false);
        else
            hideTypingSwitch.setChecked(true);

        reportReadSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Privacy.setContactAffectedByBlueTickMod(JabberID, !b);
            }
        });

        reportReceivedSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Privacy.setContactAffectedBySecondTickMod(JabberID, !b);
            }
        });

        hideTypingSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Privacy.setContactAffectedByHideTypingMod(JabberID, !b);
            }
        });
    }

    public static void _getView(View v) {
        try {
            if (Utils.nightModeShouldRun()) {
                v.setBackgroundColor(Utils.getDarkColor(3));
                TextView name = (TextView) v.findViewById(Resources.id.name);
                TextView status = (TextView) v.findViewById(Resources.id.status);
                name.setTextColor(Utils.getDarkColor(0));
                status.setTextColor(Utils.getDarkColor(1));
            }
        } catch (Exception e) {
            Utils.manageException(e);
        }
    }
}