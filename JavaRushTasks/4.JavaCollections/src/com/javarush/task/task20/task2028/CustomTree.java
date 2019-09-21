package com.javarush.task.task20.task2028;

import java.io.Serializable;
import java.util.*;

/* 
Построй дерево(1)
*/
public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {
    Entry<String> root;
    private int size = 0;
    public CustomTree(){
        this.root = new Entry<String>("0");
        root.elementName = "0";
    }

    private Queue<Entry> entriesQueue = new LinkedList<>();



    @Override
    public String get(int index){
        throw new UnsupportedOperationException();
    }
    @Override
    public String set(int index, String element){
        throw new UnsupportedOperationException();
    }
    @Override
    public void add(int index, String element){
        throw new UnsupportedOperationException();
    }
    @Override
    public String remove(int index){
        throw new UnsupportedOperationException();
    }
    @Override
    public List<String> subList(int fromIndex, int toIndex){
        throw new UnsupportedOperationException();
    }
    @Override
    protected void removeRange(int fromIndex, int toIndex){
        throw new UnsupportedOperationException();
    }
    @Override
    public boolean addAll(int index, Collection<? extends String> c){
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return size;
    }

    public boolean isBlocked(){
        boolean checkBlocked = true;
        for (Entry node : entriesQueue){
            if (node.isAvailableToAddChildren()) checkBlocked = false;
        }return checkBlocked;
    }
    @Override
    public boolean add(String elementName){
        if(entriesQueue.isEmpty()){
            entriesQueue.add(root);
        }

        Entry entry = new Entry(elementName);

        for (Entry node : entriesQueue){

            if (isBlocked() || node.availableToAddLeftChildren){

                if (node.leftChild == null){
                    entry.elementName = elementName;
                    node.leftChild = entry;
                    node.availableToAddLeftChildren = false;
                    entry.parent = node;
                    entriesQueue.add(entry);
                    size ++;
                    break;

                }
                if (node.isDeleted){
                    node.elementName = elementName;
                    node.parent.availableToAddLeftChildren = false;
                    node.isDeleted = false;
                    size ++;
                    break;
                }

            }
            if (isBlocked() || node.availableToAddRightChildren){
                if (node.rightChild == null){
                    entry.elementName = elementName;
                    node.availableToAddRightChildren = false;
                    node.rightChild = entry;
                    entry.parent = node;
                    entriesQueue.add(entry);
                    size++;
                    break;
                }
                if (node.isDeleted){
                    node.elementName = elementName;
                    node.parent.availableToAddRightChildren = false;
                    node.isDeleted = false;
                    size ++;
                    break;
                }
            }
//            if (node.leftChild != null && node.rightChild != null){
//                if (node.leftChild.isDeleted && node.rightChild.isDeleted){
//                    node.availableToAddLeftChildren = true;
//                    node.availableToAddRightChildren = true;
//                }
//            }

        }

        return true;
    }

    public String getParent(String elementName){
        String parentName = "The expected parent not found";

        for (Entry node : entriesQueue){
            if (node.elementName.equals(elementName)) {
                if (node.isDeleted){
                    parentName = "node is deleted";
                    break;
                }else parentName = node.parent.elementName;
            }

        }
        return parentName;
    }

    public boolean remove(Object o){

        if (!(o instanceof String))throw new UnsupportedOperationException();

        for (Entry node : entriesQueue){
            if (node.elementName.equals("0"))continue;
            if (node.isDeleted)continue;
            if (node.elementName.equals(o)){
                node.isDeleted = true;
                node.availableToAddLeftChildren = false;
                node.availableToAddRightChildren = false;
                size--;
            }
            if (node.parent.isDeleted == true){
                node.isDeleted = true;
                node.availableToAddLeftChildren = false;
                node.availableToAddRightChildren = false;
                size--;
            }

        }

        return true;
    }

    static class Entry<T> implements Serializable{
        String elementName;
        boolean isDeleted;
        boolean availableToAddLeftChildren;
        boolean availableToAddRightChildren;
        Entry<T> parent, leftChild, rightChild;


        public Entry(String elementName){
            this.elementName = null;
            this.isDeleted = false;
            this.parent = null;
            this.leftChild = null;
            this.rightChild = null;
            this.availableToAddLeftChildren = true;
            this.availableToAddRightChildren = true;

        }

        public boolean isAvailableToAddChildren(){
            return availableToAddLeftChildren || availableToAddRightChildren;
        }
    }
}
