package com.company.repclashsample.screen.sample;

import io.jmix.ui.screen.*;
import com.company.repclashsample.entity.Sample;

@UiController("Sample.browse")
@UiDescriptor("sample-browse.xml")
@LookupComponent("samplesTable")
public class SampleBrowse extends StandardLookup<Sample> {
}