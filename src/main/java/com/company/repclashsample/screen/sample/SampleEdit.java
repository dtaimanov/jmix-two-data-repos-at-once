package com.company.repclashsample.screen.sample;

import io.jmix.ui.screen.*;
import com.company.repclashsample.entity.Sample;

@UiController("Sample.edit")
@UiDescriptor("sample-edit.xml")
@EditedEntityContainer("sampleDc")
public class SampleEdit extends StandardEditor<Sample> {
}