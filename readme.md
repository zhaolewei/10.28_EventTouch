#Android事件分发
事件分发、焦点问题

ViewGroup的相关事件有三个：onInterceptTouchEvent、dispatchTouchEvent和onTouchEvent
View的相关事件：dispatchTouchEvent和onTouchEvent
onInterceptTouchEvent:拦截事件
dispatchTouchEvent：分发（入口）事件
onTouchEvent： 消费事件
---------------------------------
##测试
-------------------------------------
onTouchEvent：false 时：

onTouchEvent：true 时：


##结论：
声明周期为：dispatchTouchEvent->onTouch-onTouchEvent->onClick
1.当onTouch的返回值为true时，表示事件被消费，事件止步于此
2.当dispatchTouchEvent的返回值为false时，事件就不会分发给自己和子VIew
3.当dispatchTouchEvent的返回值为true时，表示消费掉事件
4.当dispatchTouchEvent的返回值为super.dispatchTouchEvent(event)时，表示向下传递


5.当子类控件的事件和父控件冲突时，可使用 v.getParent().requestDisallowInterceptTouchEvent(true); 拦截父控件的事件

6.当某个子View返回true时，会中止Down事件的分发，同时在ViewGroup中记录该子View。接下去的Move和Up事件将由该子View直接进行处理。由于子View是保存在ViewGroup中的，多层ViewGroup的节点结构时，上级ViewGroup保存的会是真实处理事件的View所在的ViewGroup对象:如ViewGroup0-ViewGroup1-TextView的结构中，TextView返回了true，它将被保存在ViewGroup1中，而ViewGroup1也会返回true，被保存在ViewGroup0中。当Move和UP事件来时，会先从ViewGroup0传递至ViewGroup1，再由ViewGroup1传递至TextView。