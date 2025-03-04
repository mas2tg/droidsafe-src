/*
 * Copyright (C) 2015,  Massachusetts Institute of Technology
 * 
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the
 * Free Software Foundation; either version 2 of the License, or (at your
 * option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc., 
 * 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 * 
 * Please email droidsafe@lists.csail.mit.edu if you need additional
 * information or have any questions.
 * 
 * 
 * This file incorporates work covered by the following copyright and
 * permission notice:
 *
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


/***** THIS FILE HAS BEEN MODIFIED FROM THE ORIGINAL BY THE DROIDSAFE PROJECT. *****/


package android.text;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import com.android.internal.util.ArrayUtils;

class PackedIntVector {
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:28:03.250 -0500", hash_original_field = "5D305AA3AFBCC646419732255616147E", hash_generated_field = "75F4039C98FB52077D38E34F530EB3FF")

    private  int mColumns;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:28:03.253 -0500", hash_original_field = "62A7B245FE69D0C88FD3CBB3F9AE6568", hash_generated_field = "18B06BC67D1393EDA8ED9BB923EF7CD3")

    private int mRows;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:28:03.256 -0500", hash_original_field = "9828EB158F3AF7FD600C6FEB32A01FE4", hash_generated_field = "EA98696F1B775619308B0863F513F9F1")

    private int mRowGapStart;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:28:03.258 -0500", hash_original_field = "4E829280F69229C952DC0CF8B0968F13", hash_generated_field = "EB5D193EB3BD0BD6791276EC10232CBE")

    private int mRowGapLength;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:28:03.261 -0500", hash_original_field = "AF95716C8E1CC9A8A1F58D24EE9BA3AC", hash_generated_field = "99CDF6DB2A492E619A6F25FAC593741C")

    private int[] mValues;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:28:03.264 -0500", hash_original_field = "F47FD65A9315F1951CA9C187E3074B88", hash_generated_field = "8A8172715F1B9899286D01C54C2B982A")

    private int[] mValueGap; // starts, followed by lengths

    /**
     * Creates a new PackedIntVector with the specified width and
     * a height of 0.
     *
     * @param columns the width of the PackedIntVector.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:28:03.267 -0500", hash_original_method = "49572B82831972D93E19442EBCB45603", hash_generated_method = "13E65AD99B01F913396CAB401CA08CE1")
    
public PackedIntVector(int columns) {
        mColumns = columns;
        mRows = 0;

        mRowGapStart = 0;
        mRowGapLength = mRows;

        mValues = null;
        mValueGap = new int[2 * columns];
    }

    /**
     * Returns the value at the specified row and column.
     *
     * @param row the index of the row to return.
     * @param column the index of the column to return.
     *
     * @return the value stored at the specified position.
     *
     * @throws IndexOutOfBoundsException if the row is out of range
     *         (row &lt; 0 || row >= size()) or the column is out of range
     *         (column &lt; 0 || column >= width()).
     */
    @DSSource({DSSourceKind.SENSITIVE_UNCATEGORIZED})
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:28:03.270 -0500", hash_original_method = "127603F69B46B56B0057C44974C5D0F5", hash_generated_method = "25992ED288C0F37472A84C3C142CBF49")
    
public int getValue(int row, int column) {
        final int columns = mColumns;

        if (((row | column) < 0) || (row >= size()) || (column >= columns)) {
            throw new IndexOutOfBoundsException(row + ", " + column);
        }

        if (row >= mRowGapStart) {
            row += mRowGapLength;
        }

        int value = mValues[row * columns + column];

        int[] valuegap = mValueGap;
        if (row >= valuegap[column]) {
            value += valuegap[column + columns];
        }

        return value;
    }

    /**
     * Sets the value at the specified row and column.
     *
     * @param row the index of the row to set.
     * @param column the index of the column to set.
     *
     * @throws IndexOutOfBoundsException if the row is out of range
     *         (row &lt; 0 || row >= size()) or the column is out of range
     *         (column &lt; 0 || column >= width()).
     */
    @DSSink({DSSinkKind.SENSITIVE_UNCATEGORIZED})
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:28:03.272 -0500", hash_original_method = "DF9491EC74B5A8AD3F1F814A7288BD27", hash_generated_method = "D24C1DCEA3381CFC0115DCF0FBDFB7B0")
    
public void setValue(int row, int column, int value) {
        if (((row | column) < 0) || (row >= size()) || (column >= mColumns)) {
            throw new IndexOutOfBoundsException(row + ", " + column);
        }

        if (row >= mRowGapStart) {
            row += mRowGapLength;
        }

        int[] valuegap = mValueGap;
        if (row >= valuegap[column]) {
            value -= valuegap[column + mColumns];
        }

        mValues[row * mColumns + column] = value;
    }

    /**
     * Sets the value at the specified row and column.
     * Private internal version: does not check args.
     *
     * @param row the index of the row to set.
     * @param column the index of the column to set.
     *
     */
    @DSComment("Private Method")
    @DSBan(DSCat.PRIVATE_METHOD)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:28:03.276 -0500", hash_original_method = "339196B1319A98FF890A6A44D9B8F936", hash_generated_method = "9190E446D7AB276087F2052A557E123D")
    
private void setValueInternal(int row, int column, int value) {
        if (row >= mRowGapStart) {
            row += mRowGapLength;
        }

        int[] valuegap = mValueGap;
        if (row >= valuegap[column]) {
            value -= valuegap[column + mColumns];
        }

        mValues[row * mColumns + column] = value;
    }

    /**
     * Increments all values in the specified column whose row >= the
     * specified row by the specified delta.
     *
     * @param startRow the row at which to begin incrementing.
     *        This may be == size(), which case there is no effect.
     * @param column the index of the column to set.
     *
     * @throws IndexOutOfBoundsException if the row is out of range
     *         (startRow &lt; 0 || startRow > size()) or the column
     *         is out of range (column &lt; 0 || column >= width()).
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:28:03.280 -0500", hash_original_method = "717B6A8B8BE261E23908EA9C8BC6E7EA", hash_generated_method = "F47F312C10A250156724576D0DC4DB4F")
    
public void adjustValuesBelow(int startRow, int column, int delta) {
        if (((startRow | column) < 0) || (startRow > size()) ||
                (column >= width())) {
            throw new IndexOutOfBoundsException(startRow + ", " + column);
        }

        if (startRow >= mRowGapStart) {
            startRow += mRowGapLength;
        }

        moveValueGapTo(column, startRow);
        mValueGap[column + mColumns] += delta;
    }

    /**
     * Inserts a new row of values at the specified row offset.
     *
     * @param row the row above which to insert the new row.
     *        This may be == size(), which case the new row is added
     *        at the end.
     * @param values the new values to be added.  If this is null,
     *        a row of zeroes is added.
     *
     * @throws IndexOutOfBoundsException if the row is out of range
     *         (row &lt; 0 || row > size()) or if the length of the
     *         values array is too small (values.length < width()).
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:28:03.283 -0500", hash_original_method = "6AE5D8E6865DDCD084B3272F01FD2E51", hash_generated_method = "D761FF91EB130E4DE335DFAAA06834FB")
    
public void insertAt(int row, int[] values) {
        if ((row < 0) || (row > size())) {
            throw new IndexOutOfBoundsException("row " + row);
        }

        if ((values != null) && (values.length < width())) {
            throw new IndexOutOfBoundsException("value count " + values.length);
        }

        moveRowGapTo(row);

        if (mRowGapLength == 0) {
            growBuffer();
        }

        mRowGapStart++;
        mRowGapLength--;

        if (values == null) {
            for (int i = mColumns - 1; i >= 0; i--) {
                setValueInternal(row, i, 0);
            }
        } else {
            for (int i = mColumns - 1; i >= 0; i--) {
                setValueInternal(row, i, values[i]);
            }
        }
    }

    /**
     * Deletes the specified number of rows starting with the specified
     * row.
     *
     * @param row the index of the first row to be deleted.
     * @param count the number of rows to delete.
     *
     * @throws IndexOutOfBoundsException if any of the rows to be deleted
     *         are out of range (row &lt; 0 || count &lt; 0 ||
     *         row + count > size()).
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:28:03.286 -0500", hash_original_method = "29D77D40DB4AFADA133299814B25205C", hash_generated_method = "30044EA25A08F89B504B681E78335132")
    
public void deleteAt(int row, int count) {
        if (((row | count) < 0) || (row + count > size())) {
            throw new IndexOutOfBoundsException(row + ", " + count);
        }

        moveRowGapTo(row + count);

        mRowGapStart -= count;
        mRowGapLength += count;

        // TODO: Reclaim memory when the new height is much smaller
        // than the allocated size.
    }

    /**
     * Returns the number of rows in the PackedIntVector.  This number
     * will change as rows are inserted and deleted.
     *
     * @return the number of rows.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:28:03.289 -0500", hash_original_method = "A7F055B05F3BF0E7B9EF67A5904EF45B", hash_generated_method = "74F46419807A9BD28AD5DC8BEC857162")
    
public int size() {
        return mRows - mRowGapLength;
    }

    /**
     * Returns the width of the PackedIntVector.  This number is set
     * at construction and will not change.
     *
     * @return the number of columns.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:28:03.291 -0500", hash_original_method = "00C81AD9ACCD847707085D62472884FD", hash_generated_method = "525004621FECD4C505A7ED932738A65D")
    
public int width() {
        return mColumns;
    }

    /**
     * Grows the value and gap arrays to be large enough to store at least
     * one more than the current number of rows.
     */
    @DSComment("Private Method")
    @DSBan(DSCat.PRIVATE_METHOD)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:28:03.295 -0500", hash_original_method = "B5C941269BF1E9CDD155EBF5B7D0DBA9", hash_generated_method = "EAECF9932D0154241C5F903CA0B78FCB")
    
private final void growBuffer() {
        final int columns = mColumns;
        int newsize = size() + 1;
        newsize = ArrayUtils.idealIntArraySize(newsize * columns) / columns;
        int[] newvalues = new int[newsize * columns];

        final int[] valuegap = mValueGap;
        final int rowgapstart = mRowGapStart;

        int after = mRows - (rowgapstart + mRowGapLength);

        if (mValues != null) {
            System.arraycopy(mValues, 0, newvalues, 0, columns * rowgapstart);
            System.arraycopy(mValues, (mRows - after) * columns,
                             newvalues, (newsize - after) * columns,
                             after * columns);
        }

        for (int i = 0; i < columns; i++) {
            if (valuegap[i] >= rowgapstart) {
                valuegap[i] += newsize - mRows;

                if (valuegap[i] < rowgapstart) {
                    valuegap[i] = rowgapstart;
                }
            }
        }

        mRowGapLength += newsize - mRows;
        mRows = newsize;
        mValues = newvalues;
    }

    /**
     * Moves the gap in the values of the specified column to begin at
     * the specified row.
     */
    @DSComment("Private Method")
    @DSBan(DSCat.PRIVATE_METHOD)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:28:03.298 -0500", hash_original_method = "6D74A2161397D319519D26FF483664C7", hash_generated_method = "BEFAF99C1B8ECA9E79E2ECB776545B01")
    
private final void moveValueGapTo(int column, int where) {
        final int[] valuegap = mValueGap;
        final int[] values = mValues;
        final int columns = mColumns;

        if (where == valuegap[column]) {
            return;
        } else if (where > valuegap[column]) {
            for (int i = valuegap[column]; i < where; i++) {
                values[i * columns + column] += valuegap[column + columns];
            }
        } else /* where < valuegap[column] */ {
            for (int i = where; i < valuegap[column]; i++) {
                values[i * columns + column] -= valuegap[column + columns];
            }
        }

        valuegap[column] = where;
    }

    /**
     * Moves the gap in the row indices to begin at the specified row.
     */
    @DSComment("Private Method")
    @DSBan(DSCat.PRIVATE_METHOD)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:28:03.302 -0500", hash_original_method = "6D396DEEC3DAD541F2D5DA5D46CC7D37", hash_generated_method = "BAC3168B96C6B3F6C160B05C3BDC4478")
    
private final void moveRowGapTo(int where) {
        if (where == mRowGapStart) {
            return;
        } else if (where > mRowGapStart) {
            int moving = where + mRowGapLength - (mRowGapStart + mRowGapLength);
            final int columns = mColumns;
            final int[] valuegap = mValueGap;
            final int[] values = mValues;
            final int gapend = mRowGapStart + mRowGapLength;

            for (int i = gapend; i < gapend + moving; i++) {
                int destrow = i - gapend + mRowGapStart;

                for (int j = 0; j < columns; j++) {
                    int val = values[i * columns+ j];

                    if (i >= valuegap[j]) {
                        val += valuegap[j + columns];
                    }

                    if (destrow >= valuegap[j]) {
                        val -= valuegap[j + columns];
                    }

                    values[destrow * columns + j] = val;
                }
            }
        } else /* where < mRowGapStart */ {
            int moving = mRowGapStart - where;
            final int columns = mColumns;
            final int[] valuegap = mValueGap;
            final int[] values = mValues;
            final int gapend = mRowGapStart + mRowGapLength;

            for (int i = where + moving - 1; i >= where; i--) {
                int destrow = i - where + gapend - moving;

                for (int j = 0; j < columns; j++) {
                    int val = values[i * columns+ j];

                    if (i >= valuegap[j]) {
                        val += valuegap[j + columns];
                    }

                    if (destrow >= valuegap[j]) {
                        val -= valuegap[j + columns];
                    }

                    values[destrow * columns + j] = val;
                }
            }
        }

        mRowGapStart = where;
    }
    
}

