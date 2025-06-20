package io.dgj7.jod.model.delta;

/**
 * <p>
 * Ways that two objects or fields can differ.
 * </p>
 */
public enum DeltaType {
    DIFFERENT_TYPES,
    NULLITY,
    NOT_EQUAL,
    COLLECTION_SIZES_NOT_EQUAL,
    COLLECTION_EXTRA_ACTUAL_ELEMENT,
    MAP_SIZES_NOT_EQUAL,
    NO_MATCHING_ELEMENT,
    ;
}
