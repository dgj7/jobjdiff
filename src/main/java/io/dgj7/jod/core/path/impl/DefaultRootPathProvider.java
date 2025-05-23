package io.dgj7.jod.core.path.impl;

import io.dgj7.jod.core.md.AbstractMetaData;
import io.dgj7.jod.core.md.IMetaDataFactory;
import io.dgj7.jod.core.path.IRootPathProvider;
import io.dgj7.jod.model.config.DifferencerConfiguration;

/**
 * Default {@link IRootPathProvider}.
 */
public class DefaultRootPathProvider implements IRootPathProvider {
    /**
     * {@inheritDoc}
     */
    @Override
    public <T> String provideRootPath(final DifferencerConfiguration config, final T expected, final T actual) {
        final IMetaDataFactory<? extends AbstractMetaData> mdf = config.getMetaDataFactory();

        if (expected != null) {
            return mdf.describeTypeName(expected);
        } else if (actual != null) {
            return mdf.describeTypeName(actual);
        } else {
            return "";
        }
    }
}
