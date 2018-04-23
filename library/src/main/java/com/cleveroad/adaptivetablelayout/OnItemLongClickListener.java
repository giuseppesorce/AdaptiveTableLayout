package com.cleveroad.adaptivetablelayout;

public interface OnItemLongClickListener {
    /**
     * Long click item callback.
     *
     * @param row    clicked item row
     * @param column clicked item column
     */
    void onItemLongClick(int row, int column);

    /**
     * Long click left top item callback
     */
    void onLeftTopHeaderLongClick();

    /**
     * Click row header item callback
     *
     * @param row clicked row header
     */
    void onRowHeaderLongClick(int row);
}
