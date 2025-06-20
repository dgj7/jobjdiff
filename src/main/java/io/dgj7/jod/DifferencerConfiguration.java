package io.dgj7.jod;

import io.dgj7.jod.model.eq.EquatableThings;
import io.dgj7.jod.pattern.builder.Builder;
import io.dgj7.jod.xt.collections.detect.ICollectionDetector;
import io.dgj7.jod.xt.collections.detect.impl.DefaultCollectionDetector;
import io.dgj7.jod.xt.collections.transform.ICollectionTransformer;
import io.dgj7.jod.xt.collections.transform.impl.DefaultCollectionTransformer;
import io.dgj7.jod.xt.enumerations.IEnumDetector;
import io.dgj7.jod.xt.enumerations.impl.DefaultEnumDetector;
import io.dgj7.jod.xt.equals.IEqualityChecker;
import io.dgj7.jod.xt.equals.impl.DefaultEqualityChecker;
import io.dgj7.jod.xt.maps.detect.IMapDetector;
import io.dgj7.jod.xt.maps.detect.impl.DefaultMapDetector;
import io.dgj7.jod.xt.maps.transform.IMapTransformer;
import io.dgj7.jod.xt.maps.transform.impl.DefaultMapTransformer;
import io.dgj7.jod.xt.nulls.INullHandler;
import io.dgj7.jod.xt.nulls.impl.DefaultNullHandler;
import io.dgj7.jod.xt.path.IRootPathProvider;
import io.dgj7.jod.xt.path.impl.DefaultRootPathProvider;
import io.dgj7.jod.xt.recurse.IShouldRecursePredicate;
import io.dgj7.jod.xt.recurse.impl.DefaultShouldRecursePredicate;
import io.dgj7.jod.xt.reflect.IFieldFinder;
import io.dgj7.jod.xt.reflect.impl.DefaultFieldFinder;
import lombok.Getter;

/**
 * <p>
 * Configuration of differencer.
 * </p>
 */
public class DifferencerConfiguration {
    @Getter
    private IFieldFinder fieldFinder;
    @Getter
    private IShouldRecursePredicate shouldRecursePredicate;
    @Getter
    private IEqualityChecker equalityChecker;
    @Getter
    private ICollectionDetector collectionDetector;
    @Getter
    private ICollectionTransformer collectionTransformer;
    @Getter
    private IMapDetector mapDetector;
    @Getter
    private IMapTransformer mapTransformer;
    @Getter
    private IEnumDetector enumDetector;
    @Getter
    private IRootPathProvider rootPathProvider;
    @Getter
    private INullHandler nullHandler;

    @Getter
    private EquatableThings equatableThings;

    /**
     * Create a new instance.
     */
    private DifferencerConfiguration() {
        // purposely empty
    }

    /**
     * Builder factory.
     */
    public static DiffConfigBuilder builder() {
        return new DiffConfigBuilder();
    }

    /**
     * Internal builder.
     */
    public static class DiffConfigBuilder implements Builder<DifferencerConfiguration> {
        private static final IFieldFinder DEFAULT_FIELD_FINDER = new DefaultFieldFinder();
        private static final IShouldRecursePredicate DEFAULT_SHOULD_RECURSE_PREDICATE = new DefaultShouldRecursePredicate();
        private static final IEqualityChecker DEFAULT_EQUALITY_CHECKER = new DefaultEqualityChecker();
        private static final ICollectionDetector DEFAULT_COLLECTION_DETECTOR = new DefaultCollectionDetector();
        private static final ICollectionTransformer DEFAULT_COLLECTION_TRANSFORMER = new DefaultCollectionTransformer();
        private static final IMapDetector DEFAULT_MAP_DETECTOR = new DefaultMapDetector();
        private static final IMapTransformer DEFAULT_MAP_TRANSFORMER = new DefaultMapTransformer();
        private static final IEnumDetector DEFAULT_ENUM_DETECTOR = new DefaultEnumDetector();
        private static final IRootPathProvider DEFAULT_ROOT_PATH_PROVIDER = new DefaultRootPathProvider();
        private static final INullHandler DEFAULT_NULL_HANDLER = new DefaultNullHandler();

        private static final EquatableThings DEFAULT_EQUATABLE_THINGS = EquatableThings.createDefault();

        private IFieldFinder theFieldFinder;
        private IShouldRecursePredicate theShouldRecursePredicate;
        private IEqualityChecker theEqualityChecker;
        private ICollectionDetector theCollectionDetector;
        private ICollectionTransformer theCollectionTransformer;
        private IMapDetector theMapDetector;
        private IMapTransformer theMapTransformer;
        private IEnumDetector theEnumDetector;
        private IRootPathProvider theRootPathProvider;
        private INullHandler theNullHandler;

        private EquatableThings theEquatableThings;

        /**
         * Feed the builder.
         */
        public DiffConfigBuilder withFieldFinder(final IFieldFinder input) {
            this.theFieldFinder = input;
            return this;
        }

        /**
         * Feed the builder.
         */
        public DiffConfigBuilder withShouldRecursePredicate(final IShouldRecursePredicate input) {
            this.theShouldRecursePredicate = input;
            return this;
        }

        /**
         * Feed the builder.
         */
        public DiffConfigBuilder withEqualityChecker(final IEqualityChecker input) {
            this.theEqualityChecker = input;
            return this;
        }

        /**
         * Feed the builder.
         */
        public DiffConfigBuilder withCollectionDetector(final ICollectionDetector input) {
            this.theCollectionDetector = input;
            return this;
        }

        /**
         * Feed the builder.
         */
        public DiffConfigBuilder withCollectionTransformer(final ICollectionTransformer input) {
            this.theCollectionTransformer = input;
            return this;
        }

        /**
         * Feed the builder.
         */
        public DiffConfigBuilder withMapDetector(final IMapDetector input) {
            this.theMapDetector = input;
            return this;
        }

        /**
         * Feed the builder.
         */
        public DiffConfigBuilder withMapTranformer(final IMapTransformer input) {
            this.theMapTransformer = input;
            return this;
        }

        /**
         * Feed the builder.
         */
        public DiffConfigBuilder withEnumDetector(final IEnumDetector input) {
            this.theEnumDetector = input;
            return this;
        }

        /**
         * Feed the builder.
         */
        public DiffConfigBuilder withRootPathProvider(final IRootPathProvider input) {
            this.theRootPathProvider = input;
            return this;
        }

        /**
         * Feed the builder.
         */
        public DiffConfigBuilder withNullHandler(final INullHandler input) {
            this.theNullHandler = input;
            return this;
        }

        /**
         * Feed the builder.
         */
        public DiffConfigBuilder withEquatableThings(final EquatableThings input) {
            this.theEquatableThings = input;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        public DifferencerConfiguration build() {
            final DifferencerConfiguration configuration = new DifferencerConfiguration();

            configuration.fieldFinder = theFieldFinder == null ? DEFAULT_FIELD_FINDER : theFieldFinder;
            configuration.shouldRecursePredicate = theShouldRecursePredicate == null ? DEFAULT_SHOULD_RECURSE_PREDICATE : theShouldRecursePredicate;
            configuration.equalityChecker = theEqualityChecker == null ? DEFAULT_EQUALITY_CHECKER : theEqualityChecker;
            configuration.collectionDetector = theCollectionDetector == null ? DEFAULT_COLLECTION_DETECTOR : theCollectionDetector;
            configuration.collectionTransformer = theCollectionTransformer == null ? DEFAULT_COLLECTION_TRANSFORMER : theCollectionTransformer;
            configuration.mapDetector = theMapDetector == null ? DEFAULT_MAP_DETECTOR : theMapDetector;
            configuration.mapTransformer = theMapTransformer == null ? DEFAULT_MAP_TRANSFORMER : theMapTransformer;
            configuration.enumDetector = theEnumDetector == null ? DEFAULT_ENUM_DETECTOR : theEnumDetector;
            configuration.rootPathProvider = theRootPathProvider == null ? DEFAULT_ROOT_PATH_PROVIDER : theRootPathProvider;
            configuration.nullHandler = theNullHandler == null ? DEFAULT_NULL_HANDLER : theNullHandler;

            configuration.equatableThings = theEquatableThings == null ? DEFAULT_EQUATABLE_THINGS : theEquatableThings;

            return configuration;
        }
    }
}
