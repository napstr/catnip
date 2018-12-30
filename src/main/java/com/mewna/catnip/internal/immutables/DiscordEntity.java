package com.mewna.catnip.internal.immutables;

import org.immutables.value.Value;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by napster on 31.12.18.
 * <p>
 * Custom style for generating implementations of our DiscordEntities.
 */
@Target({ElementType.PACKAGE, ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
@Value.Style(
        typeImmutable = "*Impl"
)
public @interface DiscordEntity {
}
