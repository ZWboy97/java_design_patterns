package component_pattern;

import java.util.Iterator;
import java.util.Stack;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/26 23:17
 */
public class ComponentIterator implements Iterator {

    Stack<Iterator> stack;

    public ComponentIterator(Iterator iterator) {
        stack = new Stack();
        stack.push(iterator);
    }

    @Override
    public void remove() {

    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator iterator = stack.peek();
            if (iterator.hasNext()) {
                return true;
            } else {
                stack.pop();
                return hasNext();
            }
        }
    }

    @Override
    public Object next() {
        if(hasNext()){
            Iterator iterator = stack.peek();
            MenuComponent item = (MenuComponent)iterator.next();
            if(item instanceof Menu){
                stack.push(item.components.iterator());
                return next();
            }else{
                return item;
            }
        }else{
            return null;
        }
    }
}
