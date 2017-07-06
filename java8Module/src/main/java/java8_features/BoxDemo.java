package java8_features;

/**
 * Type Inference
 */
public class BoxDemo {
    public static <U> void addBox(U u,
                                  java.util.List<Box<U>> boxes) {
        Box<U> box = new Box<>();
        box.set(u);
        boxes.add(box);
    }

    public static <U> void outputBoxes(java.util.List<Box<U>> boxes) {
        int counter = 0;
        for (Box<U> box: boxes) {
            U boxContents = box.get();
            System.out.println("java8_features.Box #" + counter + " contains [" +
                    boxContents.toString() + "]");
            counter++;
        }
    }

    public static void main(String[] args) {
        java.util.ArrayList<Box<String>> listOfIntegerBoxes =
                new java.util.ArrayList<>();
        BoxDemo.addBox("1", listOfIntegerBoxes);
        BoxDemo.addBox("2", listOfIntegerBoxes);
        BoxDemo.addBox("3", listOfIntegerBoxes);
        BoxDemo.outputBoxes(listOfIntegerBoxes);

        java.util.ArrayList<Box<Integer>> listOfIntegerBoxes2 =
                new java.util.ArrayList<>();
        BoxDemo.addBox(4, listOfIntegerBoxes2);
        BoxDemo.addBox(5, listOfIntegerBoxes2);
        BoxDemo.addBox(6, listOfIntegerBoxes2);
        BoxDemo.outputBoxes(listOfIntegerBoxes2);
    }
}
