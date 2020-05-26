package itearator_pattern.menu;

import java.util.Iterator;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/26 21:25
 */
public class MyIterator implements Iterator {

    private MenuItem[] items;
    private int position;


    public MyIterator(MenuItem[] items) {
        this.items = items;
        this.position = 0;
    }

    @Override
    public void remove() {
        if (this.position <= 0) {
            throw new IllegalStateException("You can not remove");
        }
        if (items[this.position - 1] != null) {
            for (int i = this.position - 1; i < this.items.length - 1; i++) {
                this.items[i] = this.items[i + 1];
            }
            this.items[this.items.length - 1] = null;
        }
    }

    @Override
    public boolean hasNext() {
        return this.position < items.length;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            MenuItem item = this.items[this.position];
            this.position++;
            return item;
        } else {
            return null;
        }
    }
}
