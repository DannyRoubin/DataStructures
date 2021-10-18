public class ArrayList {
    private int numElements = 0;
    private int arrayLength;
    private Object[] obj;

    // constructor which sets the size of the object
    ArrayList(int size) {
        arrayLength = size;
        obj = new Object[size];
    }

    ArrayList() {
        arrayLength = 10;
        obj = new Object[arrayLength];
    }

    public void insert(Object nObj, int index) {
        while(index + 1 >obj.length) {
            forceIncrease();
        }
        lengthCheck();
        numElements++;
        for (int i = numElements - 1; i > index; i--) {
            if (obj[i-1] == null) {

            } else {
            obj[i] = obj[i - 1];
            }
        }
        obj[index] = nObj;
    }


    // append method to add a new object to the end of the list
    public void append(Object nObj) {
        obj[numElements++] = nObj;
    }

    public Object remove(int index) {
        Object holder = obj[index];
        obj[index] = null;
        numElements--;
        return holder;
    }

    // get method to return the object at the given index
    public Object get(int index) {
        return obj[index];
    }


    // toString method to print out the entire ArrayList
    @Override
    public String toString() {
        String retVal = "";
        for(int i = 0; i < numElements; i++) {
            retVal += obj[i];
            retVal += " ";
            
        }
        return retVal;
    }

    // method to check if list is almost out of space
    public void lengthCheck() {
        if (obj[obj.length -1] != null) {
            Object[] newObj = new Object[(obj.length * 2)];
            for (int i = 0; i < numElements; i++) {
                newObj[i] = obj[i];
            }
            this.obj = newObj; 
        } else {
        }

    }

    public void forceIncrease() {
        Object[] newObj = new Object[(obj.length * 2)];
            for (int i = 0; i < numElements; i++) {
                newObj[i] = obj[i];
            }
            this.obj = newObj; 
    }
    

    public boolean isEmpty() {
        if (numElements < 1) {
            return true;
        } else {
            return false;
        }
    }

    public int getIndexOf(Object nObj) {
        int tracker = -1;
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] == nObj) {
                tracker = i;
                return tracker;
            }
        }
        return tracker;
    }

    public boolean equals(ArrayList that) {
        Object[] nObj = that.obj;
        if (obj.length == nObj.length) {
            for (int i = 0; i < obj.length; i++) {
                if (obj[i] != nObj[i]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean contains(Object nObj) {
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] == nObj) {
                return true;
            } 
        }
        return false;
    }

    // gets numElements
    public int size() {
        return this.numElements;
    }
    
    // gets ArrayLength
    public int getArrayLength() {
        return this.arrayLength = obj.length;
    }
}
