package com.bitlogictechnologies.isaacwedsgifty;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Mike-berg on 14/04/2017.
 */

public class ExpandableListAdapter extends BaseExpandableListAdapter {
    private Context _context;
    private List<String> _listWordHeader; // header titles
    // child data in format of header title, child title
    private HashMap<String, List<String>> _listMeaningData;

    public ExpandableListAdapter(Context context, List<String> listWordHeader,
                                 HashMap<String, List<String>> listMeaningData) {
        this._context = context;
        this._listWordHeader = listWordHeader;
        this._listMeaningData = listMeaningData;
    }

    @Override
    public Object getChild(int groupPosition, int childPosititon) {
        return this._listMeaningData.get(this._listWordHeader.get(groupPosition))
                .get(childPosititon);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {

        final String childText = (String) getChild(groupPosition, childPosition);

        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.meaning_dsn, null);
        }

        TextView lblMeaning = (TextView) convertView
                .findViewById(R.id.lblMeaningList);

        lblMeaning.setText(childText);
        return convertView;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this._listMeaningData.get(this._listWordHeader.get(groupPosition))
                .size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this._listWordHeader.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return this._listWordHeader.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        String headerTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.word_dsn, null);
        }

        TextView lblWord = (TextView) convertView
                .findViewById(R.id.lblWordList);
        lblWord.setTypeface(null, Typeface.BOLD);
        lblWord.setText(headerTitle);

        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
