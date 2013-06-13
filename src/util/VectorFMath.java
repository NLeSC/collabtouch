package util;

import java.nio.FloatBuffer;
import java.util.List;

public class VectorFMath {

    /**
     * Helper method to calculate the dot product of two vectors
     * 
     * @param u
     *            The first vector.
     * @param v
     *            The second vector.
     * @return The dot product of the two vectors.
     */
    public static float dot(VecF2 u, VecF2 v) {
        return u.v[0] * v.v[0] + u.v[1] * v.v[1];
    }

    /**
     * Helper method to calculate the length of a vector.
     * 
     * @param u
     *            The vector.
     * @return The length of the vector.
     */
    public static float length(VecF2 v) {
        return (float) Math.sqrt(dot(v, v));
    }

    /**
     * Helper method to normalize a vector.
     * 
     * @param u
     *            The vector.
     * @return The normal of the vector.
     */
    public static VecF2 normalize(VecF2 v) {
        return v.div(length(v));
    }

    /**
     * Helper method to create a FloatBuffer from an array of vectors.
     * 
     * @param array
     *            The array of vectors.
     * @return The new FloatBuffer
     */
    public static FloatBuffer toBuffer(float[] array) {
        FloatBuffer result = FloatBuffer.allocate(array.length);

        for (int i = 0; i < array.length; i++) {
            result.put(array[i]);
        }

        result.rewind();

        return result;
    }

    /**
     * Helper method to create a FloatBuffer from an array of vectors.
     * 
     * @param array
     *            The array of vectors.
     * @return The new FloatBuffer
     */
    public static FloatBuffer toBuffer(VecF2[] array) {
        FloatBuffer result = FloatBuffer.allocate(array.length * 2);

        for (int i = 0; i < array.length; i++) {
            result.put(array[i].asBuffer());
        }

        result.rewind();

        return result;
    }

    /**
     * Helper method to create a FloatBuffer from an array of vectors.
     * 
     * @param array
     *            The List of vectors.
     * @return The new FloatBuffer
     */
    public static FloatBuffer listToBuffer(List<Float> list) {
        FloatBuffer result = FloatBuffer.allocate(list.size());

        for (Float f : list) {
            result.put(f);
        }

        result.rewind();

        return result;
    }

    /**
     * Helper method to create a FloatBuffer from an array of vectors.
     * 
     * @param array
     *            The List of vectors.
     * @return The new FloatBuffer
     */
    public static FloatBuffer vec2ListToBuffer(List<VecF2> list) {
        FloatBuffer result = FloatBuffer.allocate(list.size() * 2);

        for (VecF2 v : list) {
            result.put(v.asBuffer());
        }

        result.rewind();

        return result;
    }
}
