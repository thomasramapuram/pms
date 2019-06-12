import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { PmsSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective } from './';

@NgModule({
  imports: [PmsSharedCommonModule],
  declarations: [JhiLoginModalComponent, HasAnyAuthorityDirective],
  entryComponents: [JhiLoginModalComponent],
  exports: [PmsSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class PmsSharedModule {
  static forRoot() {
    return {
      ngModule: PmsSharedModule
    };
  }
}
